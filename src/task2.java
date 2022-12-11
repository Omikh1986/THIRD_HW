/* 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
        sum / count*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 1, 0, 2, 11, 3, 13, 7, 4);
        int max = 0;
        int min = 0;
        int average = list.size();
        int sum = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int x = iterator.next();
            sum += x;
            max = x > max ? x : max;
            min = x < min ? x : min;
        }
        System.out.println("Максимальное число списка: " + max);
        System.out.println("Минимальное число списка: " + min);
        System.out.println("Среднее число списка: " + sum/average);
    }
}


