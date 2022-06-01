package Cycle;

import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        System.out.println("Set length of array");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        double array[] = new double[size];
        System.out.println("Insert array elements");
        double sum = 0;
        for (int i = 0; i < size; i++) {
            array[i] = input.nextDouble();
            sum = sum + array[i];
        }
        for (int i = 0; i < size; i++) {
            double sum2 = sum / size;
            System.out.println(array[i] * sum2);


        }
    }
}

