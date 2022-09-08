package conditionals_and_loops.basic_java_programs;

//question
// Area of circle, triangle, rectangle, Isosceles triangle, parallelogram,
// rhombus, equilateral triangle

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("""
                Enter the number
                1. Area of circle
                2. Area of triangle
                3. Area of rectangle
                4. Area of Isosceles triangle
                5.Area of parallelogram
                6. Area of rhombus
                7. Area of equilateral triangle""");

        int option = input.nextInt();

        switch (option) {
            case 1 -> {
                System.out.println("Enter the radius of circle");
                float radius = input.nextFloat();
                float res = (float) Math.PI * radius * radius;
                System.out.println("The area of the circle is :" + "" +
                        String.format("%.4f", res) + "" + "units");
            }
            case 2 -> {
                System.out.println("Enter the base");
                float base = input.nextFloat();
                System.out.println("Enter the height");
                float height = input.nextFloat();
                float res = (float) 0.5 * base * height;
                System.out.println("The area of the triangle is :" + "" +
                        String.format("%.4f", res) + "" + "units");
            }
            case 5, 3 -> {
                System.out.println("Enter the length");
                float length = input.nextFloat();
                System.out.println("Enter the breadth");
                float breadth = input.nextFloat();
                float res = length * breadth;
                System.out.println("The area is :" + "" +
                        String.format("%.4f", res) + "" + "units");

            }
            case 4 -> {
                System.out.println("Enter the base");
                float base = input.nextFloat();
                System.out.println("Enter the length of one side of triangle(except base)");
                float side = input.nextFloat();
                float res = (float) 0.5 * base * (float) Math.pow((side * side) - (base * base) / 4, 0.5);
                System.out.println("The area of the isosceles triangle is :" + "" +
                        String.format("%.4f", res) + "" + "units");
            }
            case 6 -> {
                System.out.println("Enter the first diagonal length");
                float diag1 = input.nextFloat();
                System.out.println("Enter the second diagonal length");
                float diag2 = input.nextFloat();
                float res = (float) (0.5) * (diag1 * diag2);
                System.out.println("The area of rhombus is" + "" +
                        String.format("%.4f", res) + "" + "units");

            }
            case 7 -> {
                System.out.println("Enter the length of the side");
                float side = input.nextFloat();
                float res = (float) Math.pow(3, 0.5) / 4 * side * side;
                System.out.println("The area of the circle is :" + "" +
                        String.format("%.4f", res) + "" + "units");
            }
            default -> System.out.println("Please enter valid option");
        }

    }
}
