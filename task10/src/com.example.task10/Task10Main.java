package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
         */
    }

    static int numMin(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if(arr.length == 0){
            return 0;
        }

        int currentMinPos = 0;
        int currentMin = arr[currentMinPos];

        for(int i = 0; i < arr.length; i++){
            if(currentMin == arr[i]){
                currentMinPos = i;
            }
            else if(currentMin > arr[i]){
                currentMin = arr[i];
                currentMinPos = i;
            }
        }

        return currentMinPos;
    }

}