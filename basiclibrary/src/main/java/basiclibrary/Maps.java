package basiclibrary;

import java.util.*;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.List;
import java.util.Collections;

public class Maps {

    public static String weather(int[][] array){
        IntStream stream1 = Arrays.stream(array).flatMapToInt(Arrays::stream);
        int max = stream1.max().getAsInt();
        IntStream stream2 = Arrays.stream(array).flatMapToInt(Arrays::stream);
        int min = stream2.min().getAsInt();

        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                hashSet.add(array[i][j]);
            }
        }

        StringBuilder strBuild = new StringBuilder();
        strBuild.append("High: " + max);
        strBuild.append("\nLow: " + min);

        for(int i = min; i < max; i++){
            if(!hashSet.contains(i)){

                strBuild.append("\nNever saw temperature: " + i);
            }
        }

        return strBuild.toString();
    }

    public String tally(List<String> listOfStrings){
        Collections.sort(listOfStrings);

        return;
    }
}
