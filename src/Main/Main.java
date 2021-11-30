package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayListCheck Array = new ArrayListCheck();
        Array.SetN(10);
        long timeAdd = Array.TestAdd();
        System.out.println("Время добавления ArrayList: " + timeAdd);
        long timeDelTail = Array.TestDeleteFromTail();
        System.out.println("Время удаления с конца ArrayList: " + timeDelTail);
        long timeDelBeginig = Array.TestDeleteFromBegin();
        System.out.println("Время удаления из начала ArrayList: " + timeDelBeginig);
    }
}
