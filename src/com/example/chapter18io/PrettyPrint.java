package com.example.chapter18io;

import java.util.Arrays;
import java.util.Collection;

public class PrettyPrint {
    public static String prettyFormat(Collection<?> c) {
        if (c.size() == 0) return "[]";
        //[a]
        /*[
            a,
            b,
            c,
          ]
        */
        StringBuilder result = new StringBuilder("[");
        for(Object o: c) {
            if (c.size() != 1) {
                result.append("\n  ");
            }
            result.append(o);
        }
        if(c.size() != 1) {
            result.append("\n");
        }
        result.append("]");
        return result.toString();
    }

    public static void prettyPrint(Collection<?> c) {
        System.out.println(prettyFormat(c));
    }

    public static void prettyPrint(Object[] c) {
        System.out.println(prettyFormat(Arrays.asList(c)));
    }
}
