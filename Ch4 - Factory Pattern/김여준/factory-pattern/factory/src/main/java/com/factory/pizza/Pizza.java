package com.factory.pizza;

public abstract class Pizza {
    protected String name;

    public String getName() { return name; }

    public void prepare() { System.out.println(name + " 준비 중(도우/소스/토핑)"); }
    public void bake()    { System.out.println(name + " 굽는 중(180도 25분)"); }
    public void cut()     { System.out.println(name + " 자르는 중"); }
    public void box()     { System.out.println(name + " 박싱 완료"); }
}
