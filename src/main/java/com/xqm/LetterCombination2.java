package com.xqm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xu
 * @date 2021/12/29 22:10
 */
public class LetterCombination2 {

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

    public List<String> convert2(int[] numbers){
        if(numbers == null || numbers.length == 0) return new ArrayList<>();
        int k = -1;
        List<String> letters = null;
        while (letters == null || letters.size() == 0)
            letters = Arrays.stream(getLetterMapping(numbers[++k])).collect(Collectors.toList());
        List<String> tempLetters = new ArrayList<>();
        while (k + 1 < numbers.length){
            String [] letter = getLetterMapping(numbers[k + 1]);
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

    private String[] getLetterMapping(int i){
        if(i < 0) return new String[]{};
        switch (i){
            case 0: return number0;
            case 1: return number1;
            case 2: return number2;
            case 3: return number3;
            case 4: return number4;
            case 5: return number5;
            case 6: return number6;
            case 7: return number7;
            case 8: return number8;
            case 9: return number9;
            default:
                char[] chars = (i + "").toCharArray();
                String[] l0 = getLetterMapping((int)chars[0] - '0');
                String[] l1 = getLetterMapping((int)chars[1] - '0');
                String[] letters = new String[l0.length + l1.length];
                int j = 0;
                for (String s : l0) {
                    letters[j] = s;
                    j++;
                }
                for (String s : l1) {
                    letters[j] = s;
                    j++;
                }
                return letters;
        }
    }

}
