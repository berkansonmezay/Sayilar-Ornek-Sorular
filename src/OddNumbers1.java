public class OddNumbers1 {
    /*
    create a Java program to display odd numbers from 1 to 100.

    1-100 arası tek sayıları yazdır.
     */

    public static void main(String args[])
    {
        int number=100;
        System.out.print("List of odd numbers from 1 to "+number+": ");
        for (int i=1; i<=number; i++)
        {
//logic to check if the number is odd or not
//if i%2 is not equal to zero, the number is odd
            if (i%2!=0)
            {
                System.out.print(i + " ");
            }
        }
    }


}
