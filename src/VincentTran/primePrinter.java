package VincentTran;

public class primePrinter {
    public static void Nprimenumbers(int N)
    {
        int counter = 4;
        if (N > 1) {
            System.out.println("2");
        }
        if (N > 2) {
            System.out.println("3");
        }
        while (counter <= N)
        {
            if (counter%2 != 0 && counter%3 != 0)
            {
                System.out.println(counter);
                counter++;
            }
            if (counter%2 == 0 || counter%3 == 0)
            {
                counter++;
            }
        }
    }
}
