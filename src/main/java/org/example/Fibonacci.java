package org.example;

public class Fibonacci {
    int firstNum = 0;
    int secondNum = 1;
    int count = 1;
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
    public void showFibonacciRecrs(int firstNum, int secondNum){
        if ( count < 21){
            int fib = firstNum + secondNum;
            System.out.println(fib);
            firstNum = secondNum;
            secondNum = fib;
            count++;

            showFibonacciRecrs(firstNum, secondNum);

        }
        System.out.println();
    }
    public void showFibonacciRec(){
        System.out.println(firstNum);
        System.out.println(secondNum);
        showFibonacciRecrs(firstNum, secondNum);
    }
}
