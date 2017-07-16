package Task_1;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //создаем коллекцию работников и сразу наполняем ее
        ArrayList<Workers> alWorkers = new ArrayList<>();
        alWorkers.add(0, new Workers(1, "Fixed1",
                1000));
        alWorkers.add(1, new Workers(2, "Fixed2",
                8356));
        alWorkers.add(2, new Workers(3, "Fixed3",
                1500));
        alWorkers.add(3, new Workers(4, "Time1",
                10, 8));
        alWorkers.add(4, new Workers(5, "Time2",
                34, 8));
        alWorkers.add(5, new Workers(6, "Time3",
                25, 8));

        //выводим элементы коллекции на экран
        for (Workers workers : alWorkers) {//выводим работничков на экран
            System.out.print(workers.getID() + "\t");
            System.out.print(workers.getName() + "\t");
            System.out.print(workers.getRate() + "\t");
            System.out.println();
        }

        System.out.println();

        //загоняем работников в массив для сортировки
        Workers workers[] = alWorkers.toArray(new Workers[alWorkers.size()]);

        //для проверки выводим данные одного из
        // элементов массива на экран
        //System.out.println(workers[0].getID() + " "
        //        + workers[0].getName() + " "
        //        + workers[0].getRate());

        int i = 0;//всякое разное для бабл сорта
        boolean flag = true;
        Workers temp;

        while (flag) {//сам бабл сорт
            flag = false;
            for (i = 0; i < workers.length - 1; i++) {
                if (workers[i].getRate() <
                        workers[i + 1].getRate()) {
                    temp = workers[i];
                    workers[i] = workers[i + 1];
                    workers[i + 1] = temp;
                    flag = true;
                }
            }
        }

        System.out.println("Task a)");
        //выводим сортированный массив на экран
        for (Workers sortedWorkers : workers) {
            System.out.println(sortedWorkers.getID() + ",\t" +
                    sortedWorkers.getName() + ",\t" +
                    sortedWorkers.getRate());
        }

        System.out.println();
        System.out.println("Task b)");

        //выводим первые 5 имен работников
        int k = 0;
        while (k < 5) {
            System.out.println(workers[k].getName());
            k++;
        }

        System.out.println();
        System.out.println("Task b)");

        //выводим идентификаторы послених трех работников из списка a)
        for (int j = workers.length - 3; j < workers.length; j++) {
            System.out.println(workers[j].getID());
        }
    }
}