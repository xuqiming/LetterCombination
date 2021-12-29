package com.xqm;

import org.junit.Test;

import java.util.List;

/**
 * @author xu
 * @date 2021/12/29 21:38
 */

public class LetterCombination2Test {

    LetterCombination2 letterCombination = new LetterCombination2();

    @Test
    public void testConvert6(){
        System.out.println("Input：{0, 11, 91}");
        print(letterCombination.convert2(new int[]{0, 11, 91}));
    }

    @Test
    public void testConvert7(){
        System.out.println("Input：{11, 21, 31}");
        print(letterCombination.convert2(new int[]{11, 21, 31}));
    }


    @Test
    public void testConvert8(){
        System.out.println("Input：{53, 64, 78}");
        print(letterCombination.convert2(new int[]{53, 64, 78}));
    }


    @Test
    public void testConvert1(){
        System.out.println("Input：{2, 3}");
        print(letterCombination.convert2(new int[]{2, 3}));
    }

    @Test
    public void testConvert2(){
        System.out.println("Input：{9}");
        print(letterCombination.convert2(new int[]{9}));
    }

    @Test
    public void testConvert3(){
        System.out.println("Input：");
        print(letterCombination.convert2(new int[]{}));
    }

    @Test
    public void testConvert4(){
        System.out.println("Input：{6, 8, 1}");
        print(letterCombination.convert2(new int[]{6, 8, 1}));
    }

    @Test
    public void testConvert5(){
        System.out.println("Input：{2, 5, 8}");
        print(letterCombination.convert2(new int[]{2, 5, 8}));
    }


    private void print(List<String> convert){
        System.out.print("Output(" + convert.size() + ")：");
        for (String s : convert) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

}
