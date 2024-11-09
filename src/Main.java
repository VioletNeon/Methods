public class Main {
    public static void main(String[] args) {
        checkLeapYear((short) 2024);
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
}