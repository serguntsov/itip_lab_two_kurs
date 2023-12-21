package lab7;

public class SumMultiThreading {
    private static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static int result = 0;
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> sumArray(0, array.length / 2));
        Thread thread2 = new Thread(() -> sumArray(array.length / 2, array.length));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
            System.out.println("Сумма элементов массива: " + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void sumArray(int start, int end) {
        int localResult = 0;
        for (int i = start; i < end; i++) {
            localResult += array[i];
        }

        //Сумма поточных результатов
        synchronized (SumMultiThreading.class) {
            result += localResult;
        }
    }
}