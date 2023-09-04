package Exceptions_HW2_Task3;

import Exceptions_HW2_Task1.InvalidNumberException;
import Exceptions_HW2_Task2.DivisionByZeroException;

import java.util.Scanner;

public class Exceptions_HW2_Task3_main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = in.nextInt();
        System.out.println("Введите второе число");
        int b = in.nextInt();
        System.out.println("Введите третье число");
        int c = in.nextInt();
        if (a > 100){
            try {
                throw new NumberOutOfRangeException();
            } catch (NumberOutOfRangeException e) {
                System.out.println("Первое " + e.getMessage());
            }
        }
        else if (b < 0){
            try {
                throw new NumberOutOfRangeException();
            } catch (NumberOutOfRangeException e) {
                System.out.println("Второе " + e.getMessage());
            }
        }
        else if (c == 0){
            try {
                throw new DivisionByZeroException();
            } catch (DivisionByZeroException e) {
                System.out.println(e.getMessage());
            }
        } else{
            System.out.println("Проверка пройдена успешно");
        }
    }
}
