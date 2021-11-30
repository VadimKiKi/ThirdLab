package Main;

import java.util.List;

/**
 * Класс для подсчета затрат времени
 * @author Vadim Taratonov
 * @version 1.0
 */
public class ListCheck {
    /**
     * Переменная количества повторений
     */
    private int N;
    /**
     * Переменная начало отсчёта времени
     */
    long startTime;
    /**
     * Переменная конца отсчёта времени
     */
    long endTime;
    /**
     * Ссылка типа интерфейс, чтобы в конструкторе присвоить ArrayList или LinkedList
     */
    private List<Integer> myList;
    /**
     * Функция инициализации количества повторений
     * @param n количество повторений, которое будет задаваться из main
     */
    public void SetN(int n) {
        N = n;
    }
    /**
     * Конструктор, который присваивает переменной myList переданный пустой ArrayList или LinkedList
     * @param list передаваемый параметр
     */
    public ListCheck(List<Integer> list) {
        this.myList = list;
    }
    /**
     * Функция подсчта времени для добавлений элемента
     * @return возвращает время, затраченное на операцию
     */
    public long TestAdd() {
        startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            myList.add(i);
        }
        endTime = System.nanoTime();
        myList.clear();
        return endTime-startTime;
    }
    /**
     * Функция подсчта времени для удаления элементов с конца списка
     * @return возвращает время, затраченное на операцию
     */
    public long TestDeleteFromTail() {
        for (int i = 0; i < N; i++) {
            myList.add(i);
        }
        startTime = System.nanoTime();
        for (int i = N - 1; i >= 0; i--) {
            myList.remove(i);
        }
        endTime = System.nanoTime();
        return endTime-startTime;
    }
    /**
     * Функция подсчта времени для удаления элементов из начала списка
     * @return возвращает время, затраченное на операцию
     */
    public long TestDeleteFromBegin() {
        for (int i = 0; i < N; i++) {
            myList.add(i);
        }
        startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            myList.remove(0);
        }
        endTime = System.nanoTime();
        return endTime-startTime;
    }
    /**
     * Функция подсчта времени для получения элемента из списка
     * @return возвращает время, затраченное на операцию
     */
    public long TestGet() {
        for (int i = 0; i < N; i++) {
            myList.add(i);
        }
        startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            myList.get(i);
        }
        endTime = System.nanoTime();
        myList.clear();
        return endTime-startTime;
    }

}
