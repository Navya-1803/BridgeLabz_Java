package level1;

public class staticKeyword {
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
        staticKeyword.num = 50;
        System.out.println("modified num");

        staticKeyword.display();
    }
}
