package com.demo.wrapperclass;

public class SampleMANEquals {
    private String name;
    private int age;
    private String Id;

    public SampleMANEquals(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.Id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SampleMANEquals{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", Id='").append(Id).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
}
