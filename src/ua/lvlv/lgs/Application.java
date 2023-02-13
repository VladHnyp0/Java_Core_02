package ua.lvlv.lgs;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        // ---- 1 ---- //
        System.out.println("---- 1 ----");
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4L;
        float f = 5F;
        double d = 6;
        boolean b2 = true;
        char c = 8;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(b2);
        System.out.println(c);

        // ---- 2 ---- //
        System.out.println("---- 2 ----");
        System.out.println("Byte max - " + Byte.MAX_VALUE + "; Byte  min - " + Byte.MIN_VALUE);
        System.out.println("Short max - " + Short.MAX_VALUE + "; Short min - " + Short.MIN_VALUE);
        System.out.println("Integer max - " + Integer.MAX_VALUE + "; Integer  min - " + Integer.MIN_VALUE);
        System.out.println("Long max - " + Long.MAX_VALUE + "; Long min - " + Long.MIN_VALUE);
        System.out.println("Float max - " + Float.MAX_VALUE + "; Float  min - " + Float.MIN_VALUE);
        System.out.println("Double max - " + Double.MAX_VALUE + "; Double  min - " + Double.MIN_VALUE);
        System.out.println("Boolean true - " + Boolean.TRUE + "; Boolean  false - " + Boolean.FALSE);
        System.out.println("Character max - " + Character.MAX_VALUE + ";  Character  min - " + Character.MIN_VALUE);

        // ---- 3 ---- //
        System.out.println("---- 3 ----");
        int[] items = { 1, 72, 92, 6, -145, 56, 2, 0, 107, -25};
        Arrays.sort(items);

        int max = items[items.length - 1];
        int min = items[0];

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
