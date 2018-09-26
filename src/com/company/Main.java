package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("Enter Size:");
            size = scanner.nextInt();
            if(size > 20)
                System.out.print("Size should not exceed 20");
        }while(size > 20);

        array = new int[size];
        int i = 0;
        while(i < array.length){
            System.out.print("nhap vao tung phan tu cua mang:");
            array[i] = scanner.nextInt();
            i++;
        }
        int  j = 0;
        System.out.print("danh sach cac phan tu cua mang:");
        for( j = 0; j< array.length; j++) {
            System.out.print(array[j] + "\t");

        }
        int max = array[0];
        int index = 1;
        for(i=0; i<array.length; i++){
            if (array[i]>max) {
                max = array[i];
                index = i + 1;
            }
        }
        System.out.print("gia tri lon nhat cua mang la:"+ max +"\to vi tri thu:" + index);
    }
}
