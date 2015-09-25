package main.java.io;

import java.util.Scanner;

public class SystemInSystemOut
{

    public static void main(String[] args)
    {
        /*Scanner sc = new Scanner(System.in);

        System.out.println("Type an integer and hit return:");
        int x = sc.nextInt();
        sc.nextLine();  //this is used to skip to the next line

        System.out.println("Type in a double (decimal) and hit return");
        Double y = sc.nextDouble();
        sc.nextLine();

        System.out.println("Type in a string and hit return:");
        String s = sc.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + y);
        System.out.println("Int: " + x);*/

        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++)
        {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-10s", s1);
            System.out.printf("%03d", x);
            System.out.println("");
        }
        System.out.println("================================");
    }

}
