package com.oleg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String read = sc.nextLine();
        String[] input;

        input = read.split(" ");

        int x = Integer.valueOf(input[0]);
        int y = Integer.valueOf(input[1]);

        String num1x = "a";
        String num2y = "a";


        int num1 = x;
        int num2 = y;
        if (x < y) {
            num1 = y;
            num2 = x;
        }

        if (num1 < 0) {
            num1 = Math.abs(num1);
            num1x = "m";
        }

        if (num2 < 0) {
            num2 = Math.abs(num2);
            num2y = "m";
        }


        int[] arr1 = new int[num1];
        int[] arr2 = new int[num2];

        String result1 = "";
        String result2 = "";
        String result = "";
        while (result1.length() < arr1.length) {
            result1 = result1.concat(num1x);
        }

        while (result2.length() < arr2.length) {
            result2 = result2.concat(num2y);
        }
        String resultMax = result1.concat(result2);
        String resultM = "";
        String resultA = "";
        String resultTemp = "";

        while (resultTemp.length() < resultMax.length()) {
            if (resultMax.charAt(resultTemp.length()) == 'a') {
                resultA = resultA.concat(String.valueOf(resultMax.charAt(resultTemp.length())));
            }

            if (resultMax.charAt(resultTemp.length()) == 'm') {
                resultM = resultM.concat(String.valueOf(resultMax.charAt(resultTemp.length())));
            }
            resultTemp = resultTemp.concat("z");
        }

        resultTemp = "";
        String resultFinal = "";
        String resultSuperFinal = "";

        if (resultM.length() == 0) {
            resultSuperFinal = String.valueOf(resultMax.length());
        } else if (resultA.length() == 0) {
            resultSuperFinal = String.valueOf(Math.round(resultMax.length() * Math.sin(270 * Math.PI / 180)));
        } else if (resultA.length() >= resultM.length()) {
            while (resultTemp.length() < resultA.length()) {
                if (resultTemp.length() >= resultM.length()) {
                    resultFinal = resultFinal.concat("r");
                }
                resultTemp = resultTemp.concat("z");
            }
            resultSuperFinal = String.valueOf(resultFinal.length());
        } else {
            resultTemp = "";
            while (resultTemp.length() < resultM.length()) {
                if (resultTemp.length()>=resultA.length()){
                    resultFinal = resultFinal.concat("r");
                }
                resultTemp = resultTemp.concat("z");
            }
            resultSuperFinal = String.valueOf(Math.round(resultFinal.length()* Math.sin(270 * Math.PI / 180)));
        }


//
        System.out.println(
                Integer.valueOf(resultSuperFinal)
        );

    }
}
