package Task_2;

import java.lang.reflect.Array;

public class MyList<E> /*implements Interface*/ {
    E[] array; //объявляем массив (тип данных E - будет заполнен в классе Main)

    public MyList(E[] array) {
        this.array = array;
    }

    public void add(int index, E data) {
        if (index < array.length) {
            array[index] = data;
        } else if (index == array.length) {
            E[] tempArray = (E[]) new Object[array.length];
            for (int i = 0; i < array.length; i++) {
                tempArray[i] = array[i];
            }
            array = (E[]) new Object[index + 1];
            for (int j = 0; j < tempArray.length; j++) {
                array[j] = tempArray[j];
            }
            array[index] = data;
        } else
            throw new ArrayIndexOutOfBoundsException
                    ("Please check your index. It is out of bounds");
    }

    public void arrayPrint() {
        if (array.length != 0) {
            System.out.print("Array is as follows: ");
            for (E arrElement : array) {
                System.out.print(arrElement + " ");
            }
            System.out.println();
        } else System.out.println("Array is empty!");
    }

    public void clear() {
        //for (int k = 0; k < array.length; k++) {
        //    array[k] = null;
        //}
        //for (E arrElement : array) {
        //    if (arrElement != null)
        //        clear();
        //}
        array = (E[]) new Object[0];
        System.out.println("Array has been cleared");
    }

    public void getElementWithIndex(int index) {
        System.out.println("Element with index " + index + " is: " + array[index]);
    }

    public int arrayLength() {
        return array.length;
    }
}

//@Override
//public void getNumberOfElements() {
//    myArrayList.size();
//}