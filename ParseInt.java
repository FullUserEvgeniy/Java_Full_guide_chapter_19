import java.io.BufferedReader;
import java.io.InputStreamReader;

//parseInt() строковое представление каждого числа преобразуется в тип int
public class ParseInt {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int i;
        int sum = 0;
        System.out.println("Вводите числа или 0 для выхода");
        do {
            str = bufferedReader.readLine();
            try {
                i = Integer.parseInt(str);
            }catch (NumberFormatException e) {
                System.out.println("Недопустимый формат числа");
                i = 0;
            }
            sum +=i;
            System.out.println("Текущая сумма = " + sum);
        }while (i != 0);
        System.out.println("Завершено");
    }
}
/*
Вводите числа или 0 для выхода
15
Текущая сумма = 15
34
Текущая сумма = 49
45
Текущая сумма = 94
66
Текущая сумма = 160
0
Текущая сумма = 160
Завершено
 */