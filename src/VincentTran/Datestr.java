package VincentTran;

public class Datestr {
    public static String birthday(String birthday)
    {
        birthday = "01/22/2001";
        String euro = birthday.substring(3, 5) + '-' + birthday.substring(0, 2) + '-' + birthday.substring(6, 10);
        return euro;
    }
}
