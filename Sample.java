import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javafx.util.Pair;

public class Sample {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");

        Integer[] input = { 1, 2, 3, 12, 4, 5, 6};
        Integer target = 7;

        List<Pair<Integer, Integer>> result = findTargetPairs(input, target);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }

    }

    private static List<Pair<Integer, Integer>> findTargetPairs(Integer[] input, Integer target) {
        int x = 0;
        List<Pair<Integer, Integer>> result = new ArrayList<>();
        Set resulSet = new HashSet<>();
        for (int i = 0; i < input.length; i++) {
            for (int j = 1; j < input.length; j++) {
                resulSet.add(new Pair<>(new Pair<>(input[i], input[j]),input[i]+input[j]));
            }
        }
        
        Iterator iterator = resulSet.iterator();
        while(iterator.hasNext()){
            Pair<Pair<Integer,Integer>,Integer> next = (Pair<Pair<Integer,Integer>,Integer>)iterator.next();   
            if(next.getValue() == target){
                System.out.println(next);
            }
        }
        return result;
    }
}