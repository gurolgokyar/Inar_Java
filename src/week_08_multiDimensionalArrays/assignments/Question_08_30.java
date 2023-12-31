package week_08_multiDimensionalArrays.assignments;

import java.util.Scanner;

public class Question_08_30 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[][] a = new double[2][2];
        System.out.println("Enter a00, a01, a10, a11, b0, b1: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = input.nextDouble();
            }
        }
        double[] b = new double[2];
        for (int i = 0; i < b.length; i++) {
            b[i] = input.nextDouble();
        }
        if (linerEquation(a,b) == null){
            System.out.println("The equation has no solution.");
        }else {
            System.out.println("x is " + linerEquation(a,b)[0] + " and y is " + linerEquation(a,b)[1]);
        }
    }

    public static double[] linerEquation(double[][] a, double[] b) {
        if (a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0) {
            return null;
        }
        double x = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        double y = (b[1] * a[0][0] - b[0] * a[1][0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        return new double[]{x, y};


    }
}
