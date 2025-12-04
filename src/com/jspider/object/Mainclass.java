package com.jspider.object;
class sample{
    static double z1 = 5.25;
    public static void view(){
        System.out.println("this is view() of sample class");
    }
}
public class Mainclass {
    static int v1 = 10;

    public static void test() {
        System.out.println("this is a test() of Mainclass");
        int sum =20 + v1;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        System.out.println("program statrs..");
        int result = 10 +v1;
        System.out.println(result);
        Mainclass.test();
        System.out.println(sample.z1);
        sample.view();
        System.out.println("program ends..");
    }
}
