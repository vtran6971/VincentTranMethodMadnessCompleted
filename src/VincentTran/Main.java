package VincentTran;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("reverse of \'reverse\' is "+VincentTranLib.reverse("reverse"));
        System.out.println("birthday of \'birthday\' is "+Datestr.birthday("birthday"));
        System.out.println("No ing of \'segment\' is "+Cutout.Segment("Segment"));
        multiplicationTable.baseandrange(2, 5);
        int input = 10;
        System.out.println("Sum of the numbers from 0 to "+input+" is "+sumUpto.Sumof(input));
        primePrinter.Nprimenumbers(10);
    }
}
