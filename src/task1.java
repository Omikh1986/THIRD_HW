import java.util.*;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        /** 1. Пусть дан произвольный список целых чисел, удалить из него четные числа*/
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 0, 2, 11, 3, 13, 7, 4);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int x = iterator.next();
            if (x%2==0) iterator.remove();
        }
        System.out.println(list);
    }
}





