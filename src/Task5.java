import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer number = sc.nextInt();

        System.out.println("Число единиц " + number % 10);
        System.out.println("Число десятков " + (number % 100) / 10);
        System.out.println("Число сотен " + number / 100);
        System.out.println("Сумма цифр " + (number % 10 + (number % 100) / 10 + number / 100));
        System.out.println("Произведение цифр " + (number % 10 * ((number % 100) / 10) * (number / 100)));
    }
}