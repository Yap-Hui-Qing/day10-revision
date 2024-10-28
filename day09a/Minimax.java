package day09a;

import java.util.*;

public class Minimax {

    public int calculateLevel(int n){
        
        if (n==1){
            return 0;
        } else{
            return 1 + calculateLevel(n/2);
        }
        
    }

    public int minimax(int currentDepth, boolean isMax, List<Integer> values, int currentNodeIndex, int depth){
        // if currentDepth equals depth == 1
        // break out of the recursive function, return the final result
        if (currentDepth == depth){
            return values.get(currentNodeIndex);
        }       

        // determine if your are processing min/max
        // use boolean isMax to check
        if (isMax){
            // call minimax function
            // return maximum of the minimum
            return Math.max(minimax(currentDepth + 1, isMax = false, values, currentNodeIndex*2, depth), 
            minimax(currentDepth + 1, isMax = false, values, currentNodeIndex*2 + 1, depth));

        } else{
            // call minimax function
            // return minimum of the maximum
            return Math.min(minimax(currentDepth + 1, isMax = true, values, currentNodeIndex*2, depth), 
            minimax(currentDepth + 1, isMax = true, values, currentNodeIndex*2 + 1, depth));
        }
    }
}
