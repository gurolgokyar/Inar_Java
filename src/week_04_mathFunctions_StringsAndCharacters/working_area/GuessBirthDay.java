package week_04_mathFunctions_StringsAndCharacters.working_area;

import java.util.Scanner;

public class GuessBirthDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int birthDay = 0;
        System.out.println("Is your birthday in Set1?");
        System.out.printf("%3d %3d %3d %3d\n%3d %3d %3d %3d\n%3d %3d %3d %3d\n%3d %3d %3d %3d\n\n",
                1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31);
        System.out.print("Enter 0 for no and 1 for yes->");
        int answer = input.nextInt();
        if (answer == 1) {
            birthDay += 1;
        }
        System.out.println("Is your birthday in Set2?");
        System.out.printf("%3d %3d %3d %3d\n%3d %3d %3d %3d\n%3d %3d %3d %3d\n%3d %3d %3d %3d\n\n",
                2, 3, 6, 7, 10, 11, 14, 15, 18, 19, 22, 23, 26, 27, 30, 31);
        System.out.print("Enter 0 for no and 1 for yes->");
        answer = input.nextInt();
        if (answer == 1) {
            birthDay += 2;
        }
        System.out.println("Is your birthday in Set3?");
        System.out.printf("%3d %3d %3d %3d\n%3d %3d %3d %3d\n%3d %3d %3d %3d\n%3d %3d %3d %3d\n\n",
                4, 5, 6, 7, 12, 13, 14, 15, 20, 21, 22, 23, 28, 29, 30, 31);
        System.out.print("Enter 0 for no and 1 for yes->");
        answer = input.nextInt();
        if (answer == 1) {
            birthDay += 4;
        }
        System.out.println("Is your birthday in Set4?");
        System.out.printf("%3d %3d %3d %3d\n%3d %3d %3d %3d\n%3d %3d %3d %3d\n%3d %3d %3d %3d\n\n",
                8, 9, 10, 11, 12, 13, 14, 15, 24, 25, 26, 27, 28, 29, 30, 31);
        System.out.print("Enter 0 for no and 1 for yes->");
        answer = input.nextInt();
        if (answer == 1) {
            birthDay += 8;
        }
        System.out.println("Is your birthday in Set5?");
        System.out.printf("%3d %3d %3d %3d\n%3d %3d %3d %3d\n%3d %3d %3d %3d\n%3d %3d %3d %3d\n\n",
                16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31);
        System.out.print("Enter 0 for no and 1 for yes->");
        answer = input.nextInt();
        if (answer == 1) {
            birthDay += 16;
        }
        System.out.println("Your birthday is " + birthDay + "!");

    }
}
