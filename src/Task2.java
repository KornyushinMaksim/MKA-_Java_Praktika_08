//        Пользователь вводит с клавиатуры размер стороны
//        квадрата. Требуется отобразить на экран незаполненный
//        квадрат (отображаются только границыквадрата). Размер
//        стороны равен введённому размеру.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер: ");
        int a = in.nextByte();

        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++){
                if (i == 0 || i == a - 1 || j == 0 || j == a - 1) System.out.print(" * ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
