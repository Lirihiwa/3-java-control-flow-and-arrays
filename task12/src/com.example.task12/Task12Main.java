package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void selectionSort(int[] arr) {
        //todo напишите здесь свою корректную реализацию этого метода, вместо существующей
        if(arr != null && arr.length != 0){
            arr = replaceMin(arr, 0);
            arr = replaceMin(arr, 1);
        }
    }

    public static int[] replaceMin(int[] arr, int leftIndex){
        int currentMinPos = leftIndex;
        int currentMin = arr[currentMinPos];

        for(int i = leftIndex; i < arr.length; i++){
            if(currentMin == arr[i]){
                currentMinPos = i;
            }
            else if(currentMin > arr[i]){
                currentMin = arr[i];
                currentMinPos = i;
            }
        }

        int temp = arr[currentMinPos];
        arr[currentMinPos] = arr[leftIndex];
        arr[leftIndex] = temp;

        return arr;
    }
}