/**
 * @Author Ahmet Gorkem DURUM
 * @Date 03.11.2020
 */

import java.util.Scanner;

public class Lab03_2019080846 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please ,Enter the lenght of the a,b,c");
        System.out.print("a=");
        double a = input.nextDouble();
        System.out.print("b=");
        double b = input.nextDouble();
        System.out.print("c=");
        double c = input.nextDouble();
        if (a<0){
            System.out.println("Error ,The length cannot be negative");
            System.exit(1);
        }
        else if (b<0){
            System.out.println("Error ,The length cannot be negative");
            System.exit(1);
        }
        else if (c<0){
            System.out.println("Error ,The length cannot be negative");
            System.exit(1);
        }
        double u=(a+b+c)/(2);
        double area=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        if (a + b <=c) {
            System.out.println("Error ,It's not a triangle");
            System.exit(1);
            }
        else if (a + c <=b) {
            System.out.println("Error ,It's not a triangle");
            System.exit(1);
        }
        else if (c + b <=a) {
            System.out.println("Error ,It's not a triangle");
            System.exit(1);
        }
        else System.out.println("Area of the triangle is:" + area);

    }
}