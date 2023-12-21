package lab7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MaxMultiThreading {

    private static int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
    };

    private static int maxElement = Integer.MIN_VALUE;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(matrix.length);

        // Запуск потоков для обработки строк матрицы
        for (int i = 0; i < matrix.length; i++) {
            final int row = i;
            executorService.submit(() -> processRow(row, matrix[0].length));
        }

        // Остановка пула потоков после завершения всех задач
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Наибольший элемент в матрице: " + maxElement);
    }

    private static void processRow(int row, int cols) {
        for (int j = 0; j < cols; j++) {
            int element = matrix[row][j];
            // Синхронизация для обновления общей переменной maxElement
            synchronized (MaxMultiThreading.class) {
                if (element > maxElement) {
                    maxElement = element;
                }
            }
        }
    }
}
