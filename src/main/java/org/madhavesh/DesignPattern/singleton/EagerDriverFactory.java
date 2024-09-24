package org.madhavesh.DesignPattern.singleton;

//How singleton is achieved- MAke constructor private,make obj private,make method as static

//There are 4 types of singlton DP
//1.Eager binding-
//2.Lazy binding
//3.synchronised
//4.Double licking
public class EagerDriverFactory {

    private static EagerDriverFactory obj= new EagerDriverFactory();

   private EagerDriverFactory()
    {}

    public static EagerDriverFactory getInstance()
    {
 System.out.println("singlton achieved");
 return obj;
    }
}
