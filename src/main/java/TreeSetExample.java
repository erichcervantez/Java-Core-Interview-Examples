package main.java;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Erich on 9/8/2015.
 */
public class TreeSetExample
{
    /**
     * This example shows how you can add values to a TreeSet in any order.
     * The TreeSet will automatically order them.
     * The TreeSet is also unique.  No duplicates allowed.
     *
     * @param args
     */
    public static void main(String[] args)
    {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(9);
        treeSet.add(67);
        treeSet.add(2);
        treeSet.add(5);

        System.out.println(treeSet);
    }
}
