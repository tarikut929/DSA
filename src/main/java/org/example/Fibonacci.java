package org.example;

public class Fibonacci {
    int firstNum = 0;
    int secondNum = 1;
    public void showFibonacci(){
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
