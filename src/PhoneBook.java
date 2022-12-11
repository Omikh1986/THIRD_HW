/*
 * 3.* Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
 * В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get()
 * искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
 * (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.*/


import java.util.*;

public class PhoneBook {
    Map<String, List<String>> map;

    List<String> numbers;
    String name;

    String number;

//    public PhoneBook(String name,String number) {
//        this.name = name;
//        this.number = number;


    public void add(String name, String number) {
        if (map.containsKey(this.name) == true) {
            numbers.add(this.number);
            map.put(this.name, numbers);
        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(number);
            map.put(name, numbers);
        }
    }

    public List<String> get(String name) {
        return map.get(name);
    }



    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("John", "33344");
        phoneBook.add("Peter", "344");
        phoneBook.add("Philipp", "344");
        phoneBook.add("Philipp", "122");

        List<String> strings = phoneBook.get("Philipp");
        System.out.println(strings);
    }
}
