//        Показать на экран все простые числа в диапазоне,
//        указанном пользователем. Число называется простым,
//        если оно делится без остатка только на себя и на единицу.
//        Например, три — это простое число, а четыре нет.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите диапазон: ");
        int b = in.nextInt();

        for (int i = 1; i < b; i++){
            int count = 0;
            for (int j = 1; j < b; j++){
                if (i % j == 0) {
                    count++;
                    if (count > 2) break;
                }
            }
            if (count < 3) System.out.println(i);
        }
    }
}
