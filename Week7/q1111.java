package Week7;

public class q1111 {
    public static void main(String[] args) {
        String hexNumber = "AB8C";
        int decimalValue = hexToDecimal(hexNumber);
        System.out.println("The decimal value of hex number " + hexNumber + " is: " + decimalValue);
    }

    public static int hexToDecimal(String hexString) {
        int decimalValue = 0;
        for (int i = 0; i < hexString.length(); i++) {
            char hexChar = hexString.charAt(i);
            int hexCharValue = Character.digit(hexChar, 16);
            decimalValue = decimalValue * 16 + hexCharValue;
        }
        return decimalValue;
    }
}