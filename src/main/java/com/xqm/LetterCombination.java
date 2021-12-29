package com.xqm;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author xu
 * @date 2021/12/29 20:23
 */
public class LetterCombination {

    private String[] number0 = {};
    private String[] number1 = {};
    private String[] number2 = {"a", "b", "c"};
    private String[] number3 = {"d", "e", "f"};
    private String[] number4 = {"g", "h", "i"};
    private String[] number5 = {"j", "k", "l"};
    private String[] number6 = {"m", "n", "o"};
    private String[] number7 = {"p", "q", "r", "s"};
    private String[] number8 = {"t", "u", "v"};
    private String[] number9 = {"w", "x", "y", "z"};

    private Map<Integer, String[]> letterMapping = new HashMap<>();
    {
        letterMapping.put(0, number0);
        letterMapping.put(1, number1);
        letterMapping.put(2, number2);
        letterMapping.put(3, number3);
        letterMapping.put(4, number4);
        letterMapping.put(5, number5);
        letterMapping.put(6, number6);
        letterMapping.put(7, number7);
        letterMapping.put(8, number8);
        letterMapping.put(9, number9);

    }


    public List<String> convert(int[] numbers){
        if(numbers == null || numbers.length == 0) return new ArrayList<>();
        int k = -1;
        List<String> letters = null;
        while (letters == null || letters.size() == 0)
            letters = Arrays.stream(letterMapping.get(numbers[++k])).collect(Collectors.toList());
        List<String> tempLetters = new ArrayList<>();
        while (k + 1 < numbers.length){
            String [] letter = letterMapping.get(numbers[k + 1]);
            if(letter.length == 0){
                k++;
                continue;
            }
            for (String s : letter) {
                for (String l : letters) {
                    tempLetters.add(l + s);
                }
            }
            letters.clear();
            letters.addAll(tempLetters);
            tempLetters.clear();
            k++;
        }

        return letters;
    }



}
