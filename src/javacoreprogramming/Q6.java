package javacoreprogramming;

public class Q6 {
    static int num = 10;
    static int number = 100;

    static{
        System.out.println("Static block executed");
        System.out.println(num);
        System.out.println(number);

        num++;
        number--;
    }

    public static void display(){
        System.out.println("static method executed");
        System.out.println(num);
        System.out.println(number);
    }

    public static void main(String[] args) {
        System.out.println("Main Method Executed");
        Q6.num = 50;
        System.out.println("modified num");

        Q6.display();
    }
}
