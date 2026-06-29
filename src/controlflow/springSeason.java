package controlflow;

import java.util.Scanner;

public class springSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birth date");
        int d = sc.nextInt();
        System.out.println("Enter your birth month number");
        int m = sc.nextInt();

        if((m==3 && d>=20)|| (m>3 && m<6)|| (m==6 && d<=20)){
            System.out.println("spring season");
        } else{
            System.out.println("Not spring season");
        }
    }
}
