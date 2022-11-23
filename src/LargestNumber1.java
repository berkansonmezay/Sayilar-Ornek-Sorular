import java.util.Scanner;

public class LargestNumber1 {
    /*
    create a Java program to find the largest of three numbers.
    Along with this, we will also learn to find the largest of three numbers
    in Java using the ternary operator.

    üç sayıdan en büyüğünü bulan bir Java programı oluşturun.
    Bununla birlikte, üçlü operatörü kullanarak
    Java'daki üç sayıdan en büyüğünü bul
     */

    public static void main(String[] args)
    {
        int a, b, c, largest, temp;
//object of the Scanner class
        Scanner sc = new Scanner(System.in);
//reading input from the user
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();
//comparing a and b and storing the largest number in a temp variable
        temp=a>b?a:b;
//comparing the temp variable with c and storing the result in the variable
        largest=c>temp?c:temp;
//prints the largest number
        System.out.println("The largest number is: "+largest);
    }
}
