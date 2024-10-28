package day09a;

import java.io.Console;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {

        Console cons = System.console();
        String integers = cons.readLine(">>> Please enter an array of integers: ");
        // split by spaces
        String[] array = integers.split("\\s+");
        List<Integer> values = new ArrayList<>();

        for (String v:array){
            if (!v.isEmpty())
                values.add(Integer.parseInt(v));
        }

        // int[] values = {2, 5, 18, 9, 73, 15, 4, 24};
        int arraySize = values.size();
        Minimax mm = new Minimax();
        // e.g. 8 represents the size of the array -- 8 numbers
        int level = mm.calculateLevel(arraySize); 

        System.out.println("Depth of recursing into the Fibonacci sequence: " + level);

        int result = mm.minimax(0, true, values, 0, level);
        System.out.println("Result of minimax for an array of integers: " + result);
    }
}
