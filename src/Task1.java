//        Пользователь вводит с клавиатуры размер стороны
//        квадрата. Требуется отобразить на экран заполненный
//        квадрат. Размер стороны равен введённому размеру.
//        Например, если пользователь ввёл 3 на экране будет выведено:
//        ***
//        ***
//        ***

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер: ");
        int a = in.nextByte();

        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
