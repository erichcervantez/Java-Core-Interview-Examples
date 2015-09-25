package main.java;

import java.util.*;

/**
 * Created by ecervantez on 9/25/2015.
 */
public class CommonChild
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();
        String aa = "";
        String bb = "";

        for (char c : a.toCharArray())
        {
            if (b.contains(Character.toString(c)))
            {
                aa += c;
            }
        }

        System.out.println(aa);

        for (char d : b.toCharArray())
        {
            if (a.contains(Character.toString(d)))
            {
                bb += d;
            }
        }


        System.out.println(bb);

        if (aa.equals(bb))
        {
            System.out.println(aa.length());
        }
    }
}
