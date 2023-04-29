// Хронометраж выполнения программы
public class Elapsed {
    public static void main(String[] args) {
        long start, end;
        System.out.println("Хронометраж цикла for от 0 до 100 000 000");
        start = System.currentTimeMillis();
        for (long i = 0; i < 100000000L; i++);
        end = System.currentTimeMillis();
        System.out.println("Затраченное время: " + (end - start) + " млсек.");
    }
}
/*
Хронометраж цикла for от 0 до 100 000 000
Затраченное время: 31 млсек.
 */