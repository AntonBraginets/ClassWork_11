package Task_3;

import com.sun.javafx.tk.TKClipboard;
import com.sun.org.apache.xpath.internal.SourceTree;

public class MyDictionary<ABC> {
    public ABC TKey[] = (ABC[]) new Object[10];
    public ABC TValue[] = (ABC[]) new Object[10];
    int count = 0;

    public MyDictionary(ABC[] TKey, ABC[] TValue) {
        this.TKey = TKey;
        this.TValue = TValue;
    }

    public void add(ABC key, ABC value) {
        for (ABC tKey : TKey) { //проверяем, нет ли уже такого же ключа в массиве
            if (tKey != null && tKey.equals(key)) {
                System.out.println("Key (" + key + ") already exists. Value (" + value + ") has not been saved.");
                return;
            }
        }

        for (ABC tKey : TKey) { //считаем, количество пустых ячеек
            if (tKey == null) {
                count++;
            }
        }

        if (count > 0) { //если есть пустые ячейки в массиве
            for (int j = 0; j < TKey.length; j++) {
                if (TKey[j] == null) {//находим эту ячейку
                    TKey[j] = key; //записываем значение ключа
                    TValue[j] = value; //и само значение
                    break;
                }
            }
        } else { //если нет свободных ячеек - увеличиваем массив на 10 ячеек и записываем в пустую ячейку ключ+значение
            ABC[] tempTKey = (ABC[]) new Object[TKey.length];
            ABC[] tempTValue = (ABC[]) new Object[TKey.length];
            for (int i = 0; i < tempTKey.length; i++) {
                tempTKey[i] = TKey[i];
                tempTValue[i] = TValue[i];
            }
            ABC[] TKey = (ABC[]) new Object[tempTKey.length + 10];
            ABC[] TValue = (ABC[]) new Object[tempTValue.length + 10];
            for (int j = 0; j < TKey.length; j++) {
                TKey[j] = tempTKey[j];
                TValue[j] = tempTValue[j];
            }
            add(key, value);
        }
    }

    public void dictionaryPrint() {
        for (int k = 0; k < TKey.length; k++) {
            System.out.println(TKey[k] + ", " + TValue[k]);
        }
    }

    public void getElemWithIndex(int index) {
        System.out.println("Element with index " + index +
                " is: " + TKey[index] + ", " + TValue[index]);
    }
}
