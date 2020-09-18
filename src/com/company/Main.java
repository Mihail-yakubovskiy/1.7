package com.company;
import java.util.Scanner;
public class Main {

    public static int Fact (int a){
        int c = 1;
        for(int i = 1; i <= a; i++){
            c = c * i;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("x = ");
        int n = in.nextInt();
        System.out.println("Factorial: " + Fact(n));
    }
}
