package main.java;

import java.util.*;

public class Collections
{

    public static void main(String[] args)
    {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(2, 3);

        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

}
