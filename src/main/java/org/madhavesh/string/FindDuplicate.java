package org.madhavesh.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {

    public static void main(String []aa)
    {
        findDuplicate();

    }
    public static void findDuplicate()
    {
        String s="maddyrai";
         char[] c= s.toCharArray();
         Map<Character,Integer> map= new HashMap<Character,Integer>();

         for(Character n:c)
         {
              Integer count= map.get(n);
              if(count==null)
              {
                  map.put(n,1);
              }
              else{map.put(n,++count);}
         }
                 Set<Map.Entry<Character,Integer>> set=   map.entrySet();
         for(Map.Entry<Character,Integer> n:set)
         {
             if(n.getValue()>1)
             {
                 System.out.println(n.getKey()+"-->>"+ n.getValue());
             }

         }

         //in single line
         map.entrySet().stream().filter(x->x.getValue()>1).forEach(n->System.out.println("value are "+n.getKey()+"--"+n.getValue()));

         //using set
        Set<Character> setn= new HashSet<Character>();
        for(Character b:c )
        {
          if(setn.add(b)==false)
          {
              System.out.println("dup val "+ b );
          }
        }



    }
}
