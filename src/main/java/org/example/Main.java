package org.example;

public class Main {
    public static void main(String[] args) {
        int firstNum = 0;
        int secondNum = 1;
        System.out.println(firstNum);
        System.out.println(secondNum);
        for (int i = 1; i < 21; i++){
            int temp = secondNum;
            secondNum = firstNum+secondNum;
            firstNum = temp;
            System.out.println(secondNum);
        }

    }
}