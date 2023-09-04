package Exceptions_HW2_Task1;

import java.util.Scanner;

public class Exceptions_HW2_Task1_main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input positive number");
        if (in.nextInt() > 0){
            System.out.println("Число корректно");
        } else {
            try {
                throw new InvalidNumberException();
            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
