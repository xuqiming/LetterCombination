package com.xqm;

import org.junit.Test;

import java.util.List;

/**
 * @author xu
 * @date 2021/12/29 21:38
 */

public class LetterCombinationTest {

    LetterCombination letterCombination = new LetterCombination();

    @Test
    public void testConvert1(){
        System.out.println("Input：{2, 3}");
        print(letterCombination.convert(new int[]{2, 3}));
    }

    @Test
    public void testConvert2(){
        System.out.println("Input：{9}");
        print(letterCombination.convert(new int[]{9}));
    }

    @Test
    public void testConvert3(){
        System.out.println("Input：");
        print(letterCombination.convert(new int[]{}));
    }

    @Test
    public void testConvert4(){
        System.out.println("Input：{6, 8, 1}");
        print(letterCombination.convert(new int[]{6, 8, 1}));
    }

    @Test
    public void testConvert5(){
        System.out.println("Input：{2, 5, 8}");
        print(letterCombination.convert(new int[]{2, 5, 8}));
    }


    private void print(List<String> convert){
        System.out.print("Output(" + convert.size() + ")：");
        for (String s : convert) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

}
