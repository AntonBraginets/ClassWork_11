package Task_2;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> newMyList = new MyList<>(new Integer[1]); //саздание массива

        newMyList.add(0, 4); //Наполнение массива
        newMyList.add(1, 1);
        newMyList.add(2, 5);

        newMyList.arrayPrint(); //Выводим массив на экран

        System.out.println("Array length is: " + newMyList.arrayLength()); //выводим длину массива
        //System.out.println(newMyList.array.length); //почему так нельзя сделать?

        newMyList.getElementWithIndex(2); //Получаем элемент с индексом 2

        newMyList.clear(); //Очищаем массив

        newMyList.arrayPrint(); //Проверяем насколько хорошо мы почистили массив
    }
}