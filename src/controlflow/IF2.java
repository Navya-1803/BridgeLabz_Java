package controlflow;

import java.util.Scanner;

public class IF2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        if(number>=0 && number<10000){
            if(number<10){
                System.out.println("unit");
            } if(number<100 && number>=10){
                System.out.println("ten");
            } if(number<1000 && number>=100){
                System.out.println("hundred");
            } else{
                System.out.println("thousand");
            }
        }else{
            System.out.println("Out of bound number");
        }
    }
}
