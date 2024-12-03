package Module_3;

public class GarbageCollector {
    int x=10;
    public static void main(String[] args) {
        GarbageCollector gc1=new GarbageCollector();
        GarbageCollector gc2=new GarbageCollector();
        System.out.println(gc1.equals(gc2));
        System.out.println(gc1==gc2);
        gc1=gc2;
        System.out.println(gc1.equals(gc2));
        System.out.println(gc1==gc2);
    }
}

class Demo{
    int x;
    Demo(int x){
        this.x=x;
    }

    public static void main(String[] args) {
        Demo d1=new Demo(10);
        Demo d2=new Demo(10);
        System.out.println(d1==d2);//Address level comparison
        System.out.println(d1.equals(d2));//content level comparison
        d2=null;//Object de-referred
        System.gc();//Before calling gc() first de-referred the Object.
    }
    @Override
    public boolean equals(Object obj){
        int n1=this.x;
        Demo de=(Demo) obj;
        int n2=de.x;
        return n1==n2;//content level comparison
    }
//    @Override
//    protected void finalize() throws  Throwable{
//        System.out.println("Object Destroyed successfully...");
//    }
}
