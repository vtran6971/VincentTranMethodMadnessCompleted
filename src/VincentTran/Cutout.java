package VincentTran;

public class Cutout {
    public static String Segment(String Segment)
    {
        String Str = "Playing with fire";
        Segment = "";
        String cut = "ing";
        Integer length = Str.length();
        Integer cutlength = cut.length();
        Segment = Str.substring(0, Str.indexOf(cut)) + Str.substring(Str.indexOf(cut)+cutlength, length);
        return Segment;
    }
}
