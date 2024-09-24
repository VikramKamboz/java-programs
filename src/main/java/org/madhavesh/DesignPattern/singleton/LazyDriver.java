package org.madhavesh.DesignPattern.singleton;

public class LazyDriver {

    private static LazyDriver obj;
    public static LazyDriver getInstance()
    {
        if(obj==null)
        {
            obj= new LazyDriver();
        }
        return obj;
    }
}
