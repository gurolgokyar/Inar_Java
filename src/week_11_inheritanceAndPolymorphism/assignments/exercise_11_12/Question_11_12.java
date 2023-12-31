package week_11_inheritanceAndPolymorphism.assignments.exercise_11_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
        }

        System.out.println("Sum of the list: " + sum(list));
    }
    public static double sum(ArrayList<Double> list){
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
