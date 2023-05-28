package baek.rectangle_triangle;

import java.util.Scanner;

public class baek_10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b + c != 180) {
            System.out.println("Error");
        } else {

            if (a == 60 && b == 60 && c == 60) {
                System.out.print("Equilateral");
            } else if (a == b || b == c || c == a) {
                System.out.print("Isosceles");
            } else {
                System.out.print("Scalene");
            }

        }

        sc.close();
    }
}
