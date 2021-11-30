package Main;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        ListCheck compareArrayList = new ListCheck(arrayList);
        ListCheck compareLinkedList = new ListCheck(linkedList);
        Scanner in = new Scanner(System.in);
        int operation1, operation2, operation3;
        System.out.print("Введите количество повторений каждой операции для первого опыта: ");
        operation1 = in.nextInt();
        System.out.print("Введите количество повторений каждой операции для второго опыта: ");
        operation2 = in.nextInt();
        System.out.print("Введите количество повторений каждой операции для третьего опыта: ");
        operation3 = in.nextInt();
        compareArrayList.SetN(operation1);
        compareLinkedList.SetN(operation1);
        System.out.printf("%-60s %-20s  %-20s%n", " ", "ArrayList", "LinkedList");
        System.out.printf("%-60s %-20s  %-20s%n", "Добавление элементов (" + operation1 + " повторений)", compareArrayList.TestAdd(), compareLinkedList.TestAdd());
        System.out.printf("%-60s %-20s  %-20s%n", "Удаление элементов с конца (" + operation1 + " повторений)", compareArrayList.TestDeleteFromTail(), compareLinkedList.TestDeleteFromTail());
        System.out.printf("%-60s %-20s  %-20s%n", "Удаление элементов из начала (" + operation1 + " повторений)", compareArrayList.TestDeleteFromBegin(), compareLinkedList.TestDeleteFromBegin());
        System.out.printf("%-60s %-20s  %-20s%n", "Получение элементов (" + operation1 + " повторений)", compareArrayList.TestGet(), compareLinkedList.TestGet());
        System.out.println();
        compareArrayList.SetN(operation2);
        compareLinkedList.SetN(operation2);
        System.out.printf("%-60s %-20s  %-20s%n", "Добавление элементов (" + operation2 + " повторений)", compareArrayList.TestAdd(), compareLinkedList.TestAdd());
        System.out.printf("%-60s %-20s  %-20s%n", "Удаление элементов с конца (" + operation2 + " повторений)", compareArrayList.TestDeleteFromTail(), compareLinkedList.TestDeleteFromTail());
        System.out.printf("%-60s %-20s  %-20s%n", "Удаление элементов из начала (" + operation2 + " повторений)", compareArrayList.TestDeleteFromBegin(), compareLinkedList.TestDeleteFromBegin());
        System.out.printf("%-60s %-20s  %-20s%n", "Получение элементов (" + operation2 + " повторений)", compareArrayList.TestGet(), compareLinkedList.TestGet());
        System.out.println();
        compareArrayList.SetN(operation3);
        compareLinkedList.SetN(operation3);
        System.out.printf("%-60s %-20s  %-20s%n", "Добавление элементов (" + operation3 + " повторений)", compareArrayList.TestAdd(), compareLinkedList.TestAdd());
        System.out.printf("%-60s %-20s  %-20s%n", "Удаление элементов с конца (" + operation3 + " повторений)", compareArrayList.TestDeleteFromTail(), compareLinkedList.TestDeleteFromTail());
        System.out.printf("%-60s %-20s  %-20s%n", "Удаление элементов из начала (" + operation3 + " повторений)", compareArrayList.TestDeleteFromBegin(), compareLinkedList.TestDeleteFromBegin());
        System.out.printf("%-60s %-20s  %-20s%n", "Получение элементов (" + operation3 + " повторений)", compareArrayList.TestGet(), compareLinkedList.TestGet());
    }
}