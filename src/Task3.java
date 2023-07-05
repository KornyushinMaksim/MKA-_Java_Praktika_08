//        Пользователь вводит с клавиатуры длину и ширину
//        прямоугольника. Требуется отобразить на экран незаполненный прямоугольник
//        (отображаются только границы прямоугольника). Размер длины и ширины равен
//        введенным данным.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину и ширину");
        int a = in.nextInt();
        int b = in.nextInt();

        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                if (i == 0 || i == a - 1 || j == 0 || j == b - 1) System.out.print(" * ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
