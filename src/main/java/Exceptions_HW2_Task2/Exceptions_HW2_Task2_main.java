package Exceptions_HW2_Task2;

import Exceptions_HW2_Task1.InvalidNumberException;

import java.util.Scanner;

public class Exceptions_HW2_Task2_main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = in.nextInt();
        System.out.println("Введите второе число");
        int b = in.nextInt();
        if (b == 0){
           try {
                throw new DivisionByZeroException();
            } catch (DivisionByZeroException e) {
                System.out.println(e.getMessage());
            }
        } else{
            System.out.println("результат деления" + a / b);
        }
    }
}
