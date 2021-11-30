package Main;

import java.util.ArrayList;

public class ArrayListCheck {
    private long startTime;
    private long endTime;
    private long duration;
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
        duration = (endTime - startTime);
        A.clear();
        return duration;
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
        duration = (endTime - startTime);
        return duration;
    }
}
