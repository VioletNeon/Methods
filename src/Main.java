import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkLeapYear((short) 2024);
        defineAppVersionAndOS((byte) 1, (short) 2020);
    }

    public static void checkLeapYear(short year) {
        short startLeapYear = 1584;
        short yearsDifference = (short) (year - startLeapYear);

        boolean isForthYear = yearsDifference % 4 == 0;
        boolean isHundredYear = yearsDifference % 100 == 0;
        boolean isFourthHundredYear = yearsDifference % 400 == 0;
        boolean isLeapYear = isFourthHundredYear || (!isHundredYear && isForthYear);

        if (isLeapYear) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }

    public static void defineAppVersionAndOS(byte clientOS, short clientDeviceYear) {
        boolean isAndroid = clientOS == 1;
        boolean isIOS = clientOS == 0;
        short currentYear = (short) LocalDate.now().getYear();

        boolean isBeforeConditionalYear = clientDeviceYear < currentYear;

        if (isAndroid && isBeforeConditionalYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (isAndroid) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }

        if (isIOS && isBeforeConditionalYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (isIOS) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        }
    }
}