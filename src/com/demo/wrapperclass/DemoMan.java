package com.demo.wrapperclass;

public class DemoMan extends SampleMANEquals {

    public DemoMan(String name, int age, String id) {
        super(name, age, id);
    }

    public static void main(String[] args) {
        DemoMan dm1=new DemoMan("Sanjeeb",31,"B0128");
        DemoMan dm2=new DemoMan("Sanjeeb",31,"B0128");

        System.out.println(dm1==dm2);
        System.out.println(dm1.equals(dm2));
    }

    @Override
    public boolean equals(Object obj){
        DemoMan dm=(DemoMan) obj;
        return dm.getName().equals(getName()) &&
                dm.getAge()==getAge() &&
                dm.getId().equals(getId());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
