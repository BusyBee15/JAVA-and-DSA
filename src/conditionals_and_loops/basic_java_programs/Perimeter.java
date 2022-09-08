package conditionals_and_loops.basic_java_programs;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("""
                Enter the number
                1. Perimeter of circle
                2. Perimeter of triangle
                3. Perimeter of rectangle
                4. Perimeter of square
                5. Perimeter of rhombus
                6. Perimeter of equilateral triangle""");

        int option = input.nextInt();

        switch (option) {
            case 1 -> {
                System.out.println("Enter the radius of circle");
                float radius = input.nextFloat();
                float res = (float) Math.PI * radius * 2;
                System.out.println("The Perimeter of the circle is :" + "" +
                        String.format("%.4f", res) + "" + "units");
            }
            case 2 -> {
                System.out.println("Enter the side1 length");
                float side1 = input.nextFloat();
                System.out.println("Enter the side2 length ");
                float side2 = input.nextFloat();
                System.out.println("Enter the side3 length ");
                float side3 = input.nextFloat();
                float res = side1 + side2 + side3;
                System.out.println("The Perimeter of the triangle is :" + "" +
                        String.format("%.4f", res) + "" + "units");
            }
            case 3 -> {
                System.out.println("Enter the length");
                float length = input.nextFloat();
                System.out.println("Enter the breadth");
                float breadth = input.nextFloat();
                float res = 2* (length + breadth);
                System.out.println("The Perimeter of rectangle is :" + "" +
                        String.format("%.4f", res) + "" + "units");

            }
            case 4, 5 -> {
                System.out.println("Enter the length of side");
                float side = input.nextFloat();
                float res = 4 * side;
                System.out.println("The Perimeter is :" + "" +
                        String.format("%.4f", res) + "" + "units");
            }
            case 6 -> {
                System.out.println("Enter the length of side");
                float side = input.nextFloat();
                float res = 3 * side;
                System.out.println("The Perimeter of equilateral triangle is :" + "" +
                        String.format("%.4f", res) + "" + "units");

            }
            default -> System.out.println("Please enter valid option");
        }

    }
}
