//        Показать на экран таблицу умножения в диапазоне,
//        указанном пользователем. Например, если пользователь
//        указал 3 и 5, таблица может выглядеть так:
//        3*1 = 3 3*2 = 6 3*3 = 9 .... 3* 10 = 30
//        .......................................
//        5*1 = 5 5 *2 = 10 5 *3 = 15 ...........

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите начало и конец диапазона");
        int a = in.nextInt();
        int b = in.nextInt();

        for (int i = a; i <= b; i++){
            for (int j = 1; j <= 10; j++){
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
    }
}
