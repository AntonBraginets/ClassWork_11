package Task_3;

public class Main {
    public static void main(String[] args) {
        MyDictionary<String> myDictionary = new MyDictionary<>(new String[10], new String[10]);

        //заполняем массивы
        myDictionary.add("1", "One");
        myDictionary.add("2", "Two");
        myDictionary.add("3", "Three");
        myDictionary.add("4", "Four");
        myDictionary.add("5", "Five");

        myDictionary.dictionaryPrint();//вывод на экран массивов

        System.out.println();
        myDictionary.getElemWithIndex(2);//выводим ключ и значение, хранящиеся под индексом 2

        System.out.println();
        int numberOfElements = 0;//считаем количество заполненных ячеек в массиве
        for (int i = 0; i < myDictionary.TKey.length; i++) {
            if (myDictionary.TKey[i] != null)
                numberOfElements++;
        }
        System.out.println("Number of elements in array is: " + numberOfElements);
    }
}
