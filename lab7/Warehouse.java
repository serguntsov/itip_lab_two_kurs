package lab7;

import java.util.concurrent.Semaphore;

public class Warehouse {
    private static final int max = 150;
    private static final int num_workers = 3;
    private static final int num_items = 10;
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(num_workers);
        int[] items = new int[num_items];
        for (int i = 0; i < num_items; i++) {
            items[i] = (int) (Math.random() * 50 + 1);
        }
        int currentWeight = 0;
        int currentItem = 0;
        boolean allItemsProcessed = false;

        while (!allItemsProcessed) {
            try {
                semaphore.acquire();
                if (currentItem < num_items && currentWeight + items[currentItem] <= max) {
                    currentWeight += items[currentItem];
                    System.out.println("Грузчик " + (currentItem % num_workers + 1) + " переносит товар " + (currentItem+1) + " весом " + items[currentItem] + " кг. Общий вес: " + currentWeight + " кг.");
                    currentItem++;
                } else {
                    allItemsProcessed = true;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }
        System.out.println("Грузчики отправляются на другой склад для разгрузки товаров.");
    }
}