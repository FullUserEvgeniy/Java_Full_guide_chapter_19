// Демонстрация использования счетчиков выпусков Runtime.Version
public class VerDemo {
    public static void main(String[] args) {
        Runtime.Version ver = Runtime.version();

        System.out.println("Счетчик выпуска функциональных средств: " + ver.feature());
        System.out.println("Счетчик промежуточных выпусков: " + ver.interim());
        System.out.println("Счетчик выпуска обновлений: " + ver.update());
        System.out.println("Счетчик выпуска исправлений: " + ver.patch());
        System.out.println("Номер сборки: " + ver.build());
    }
}
/*
Счетчик выпуска функциональных средств: 19
Счетчик промежуточных выпусков: 0
Счетчик выпуска обновлений: 1
Счетчик выпуска исправлений: 0
Номер сборки: Optional[10]
 */