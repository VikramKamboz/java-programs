package org.madhavesh.DesignPattern.singleton;

public class StepClass {

    public static void main( String[] args)
    {
        EagerDriverFactory obj= EagerDriverFactory.getInstance();
        System.out.println(obj);
    }
}

