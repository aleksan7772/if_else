import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 7");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Понедельник " + " Это рабочий день ");
                break;
            case 2:
                System.out.println("Вторник " + " Это рабочий день ");
                break;
            case 3:
                System.out.println("Четверг " + " Это рабочий день ");
                break;
            case 4:
                System.out.println("Среда " + " Это рабочий день ");
                break;
            case 5:
                System.out.println("Пятница " + " Это рабочий день ");
                break;
            case 6:
                System.out.println("Суббота " + " Это выходной день ");
                break;
            case 7:
                System.out.println("Воскресенье " + " Это выходной день ");
                break;
            default:
                System.out.println("Вы ввели неверное число");
        }
    }
}
