package lab4;

import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        try{
            int a = scan.nextInt();
            scan.close();
            for (int i = 1; i < 5; i++){
                arr[i-1] = i;
            } arr[4] = a; //ввод последнего элемента массива
            for (int j = 0; j < arr.length; j++){ //цикл <=/<
                sum += arr[j];
            }
            System.out.println("Результат программы: " + sum / arr.length);
        } catch (java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("Цикл вышел за границы массива");
        } catch (java.util.InputMismatchException e){
            System.out.println("Ошибка неверных типов данных массива");
        }
    }
}

