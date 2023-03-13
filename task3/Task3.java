// Данис Шарипов

package task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task3 {

    private static void mean(ArrayList<Integer> arr) {

        System.out.println();
        double sum = 0;

        for (int i = 0; i < arr.size(); i++) 
            sum += arr.get(i);

        double result = sum / arr.size();
        boolean flag = false;

        for (int i = 1; i < 10; i++) {
            if (result % i == 0) {
                System.out.println("Среднее арифмитическое списка: " + (int) result);
                flag = true;
                break;
            }
        }

        if (flag == false) 
            System.out.println("Среднее арифмитическое списка: " + result);

    }

    private static void FillArr(ArrayList<Integer> arr) {

        System.out.println();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            arr.add(rnd.nextInt(1, 10));
        }

        System.out.println("Сформированный список: " + arr);

    }

    public static void main(String[] args) {

        System.out.println("\033[H\033[2J");
        ArrayList<Integer> arr = new ArrayList<Integer>();
        FillArr(arr);
        System.out.println();
        System.out.println("Максимальный элемент в списке: " + Collections.max(arr));
        System.out.println();
        System.out.println("Минимальный элемент в списке: " + Collections.min(arr));
        mean(arr);
        
    }
}

