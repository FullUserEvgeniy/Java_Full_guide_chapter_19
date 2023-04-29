// Демонстрация работы метода ехес()
public class ExecDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec("notepad");
            p.waitFor();
        }catch (Exception e){
            System.out.println("Ошибка при выполнении notepad");
        }
        System.out.println("Программа notepad возвратила " + p.exitValue());
    }
}
/*
Программа notepad возвратила 0
 */