//Преобра зование целого числа в двоичную, шестнадцатеричную и восьмеричную строку
public class StringConversion {
    public static void main(String[] args) {
        int num = 2023;
        System.out.println(num + " в двоичной форме: " + Integer.toBinaryString(num));
        System.out.println(num + " в восьмеричной форме: " + Integer.toOctalString(num));
        System.out.println(num + " в шестнадцатеричной форме: " + Integer.toHexString(num));
    }
}
/*
2023 в двоичной форме: 11111100111
2023 в восьмеричной форме: 3747
2023 в шестнадцатеричной форме: 7e7
 */
//601