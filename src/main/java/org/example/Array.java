package org.example;

public class Array {
    int [] myArray = {2,3,5,6,3,1};
    public void findLowest(){
        int lowest = myArray[0];
        for (int i : myArray ){
            if (i < lowest){
                lowest = i;
            }
        }
        System.out.println(lowest);
    }
}
