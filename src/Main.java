import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Double double1 = Double.valueOf("23.56");
        Double double2 = Double.valueOf(10.326);
        String string1 = "56";
        double stringToDouble = Double.parseDouble(string1);
        byte doubleToByte = double2.byteValue();
        System.out.println("Byte " + doubleToByte);
        short doubleToShort = double2.shortValue();
        System.out.println("Short " + doubleToShort);
        int doubleToInt = double2.intValue();
        System.out.println("Int " + doubleToInt);
        long doubleToLong = double2.longValue();
        System.out.println("Long " + doubleToLong);
        double doubleToDouble = double2.doubleValue();
        System.out.println("Double " + doubleToDouble);
        float doubleToFloat = double2.floatValue();
        System.out.println("Float " + doubleToFloat);

        double doubleToString = 3.14;
        String string2 = Double.toString(doubleToString);
        System.out.println(string2);
        System.out.println(Color.RED);
        System.out.println(Color.RED.getHexCode());
    }
}