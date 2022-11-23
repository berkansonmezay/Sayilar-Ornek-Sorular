public class EvenNumbers1 {
    /*
    create a Java program to display even numbers from 1 to 100

    1-100 arasi çift sayıları yazdır
     */

    public static void main(String args[])
    {
        int number=100;
        System.out.print("List of even numbers from 1 to "+number+": ");
        for (int i=1; i<=number; i++)
        {
//logic to check if the number is even or not
//if i%2 is equal to zero, the number is even
            if (i%2==0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
