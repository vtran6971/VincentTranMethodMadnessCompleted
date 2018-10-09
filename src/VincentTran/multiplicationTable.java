package VincentTran;

public class multiplicationTable {
    public static void baseandrange(int base, int range)
    {
        int product = 0;
        for (int i = 0; i <= range; i++)
        {
            product = base*i;
            System.out.println(base +" times "+ i + " equals "+ product);
        }
    }
}
