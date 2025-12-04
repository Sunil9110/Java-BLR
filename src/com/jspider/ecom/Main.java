package com.jspider.ecom;
class parent{
    static void show(){
        System.out.println("parent static show");
    }
}
class child extends parent{
    static void show(){
        System.out.println("child static show");
    }
}
public class Main {
    public static void main(String[] args) {
        parent p = new parent();
        parent pc = new child();
        child cc = new child();

        p.show();
        pc.show();
        cc.show();
    }
}
