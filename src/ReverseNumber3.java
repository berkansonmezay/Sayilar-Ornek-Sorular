public class ReverseNumber3 {
    public static void main(String[] args)
    {
        int sayi = 987654, sayininTersi = 0;
        while(sayi != 0)
        {
            int kalan = sayi % 10;
            sayininTersi = sayininTersi * 10 + kalan;
            sayi = sayi/10;
        }
        System.out.println("The reverse of the given number is: " + sayininTersi);
    }
}
