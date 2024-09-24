package org.madhavesh.DesignPattern.singleton;

public class DoubleLocking {
//if object is null goes inside synch is not it returns value
    private static DoubleLocking obj;
     public static DoubleLocking getInstance()
    {
        if(obj==null)
            synchronized(DoubleLocking.class)
        {
                if(obj==null){
                obj= new DoubleLocking();}
            }
        return obj;
    }
}
