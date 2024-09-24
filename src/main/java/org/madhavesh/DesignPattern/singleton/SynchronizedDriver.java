package org.madhavesh.DesignPattern.singleton;

public class SynchronizedDriver {
//very expensive for 1000 requests a queue has to maintain so a resource is needed to make it queqe
    private static SynchronizedDriver obj;
    synchronized public static SynchronizedDriver getInstance()
    {
        if(obj==null)
        {
            obj= new SynchronizedDriver();
        }
        return obj;
    }
}
