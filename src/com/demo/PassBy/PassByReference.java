package com.demo.PassBy;

public class PassByReference {
    int x;
    int y;
    PassByReference(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int add(PassByReference r){
        r.x++;
        r.y++;
        return r.x+r.y;
    }

    public static void main(String[] args) {
        PassByReference pr=new PassByReference(2,6);
        System.out.printf("X value is:: %d and Y value is %d",pr.x,pr.y);
        System.out.println(" and Sum is %d "+pr.add(pr));
        System.out.printf("X value is:: %d and Y value is %d",pr.x,pr.y);
    }
}
