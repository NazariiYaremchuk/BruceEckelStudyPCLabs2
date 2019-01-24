package Exercise8;

/**
 * Exercise 8: (2) Show that hex and octal notations work with long values. Use
 * Long.toBinaryString( ) to display the results.
 */

public class Exercise8_Main {
    public static void main(String[] args) {
        long HexadecimalLowercase = 0x2f;   //Шістнадцяткова с.ч.(Нижній регістр)
        System.out.println("47: " + Long.toBinaryString(HexadecimalLowercase) + "\t- Hexadecimal (lowercase)");
        long HexadecimalUppercase = 0X2F;   //Шістнадцяткова с.ч.(Верхній регістр)
        System.out.println("47: " + Long.toBinaryString(HexadecimalUppercase) + "\t- Hexadecimal (uppercase)");
        long octal = 0177;  //Вісімкова с.ч.
        System.out.println("127: " + Long.toBinaryString(octal) + "\t- Octal");
    }
}