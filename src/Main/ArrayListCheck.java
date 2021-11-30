package Main;

import java.util.ArrayList;

public class ArrayListCheck {
    private long startTime;
    private long endTime;
    private ArrayList<Integer> A = new ArrayList<>();
    private int N;

    public void SetN(int n) {
        N = n;
    }


    public long TestAdd() {
        startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            A.add(1);
        }
        endTime = System.nanoTime();
        A.clear();
        return endTime - startTime;
    }

    public long TestDeleteFromTail() {
        for (int i = 0; i < N; i++) {
            A.add(1);
        }
        startTime = System.nanoTime();
        for (int i = N - 1; i >= 0; i--) {
            A.remove(i);
        }
        endTime = System.nanoTime();
        return endTime - startTime;
    }

    public long TestDeleteFromBegin() {
        for (int i = 0; i < N; i++) {
            A.add(1);
        }
        startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            A.remove(0);
        }
        endTime = System.nanoTime();
        return endTime - startTime;
    }
}
