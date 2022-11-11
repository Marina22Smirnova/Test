import java.util.Scanner;
public class Home3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer number = sc.nextInt();

        Integer a = (number/10);
        System.out.println("Число десятков: " + a);

        Integer b = number % 10;
        System.out.println("Число единиц: " + b);

        System.out.println("Остаток от деления десятков на единицы: " + a%b);
        System.out.println("Результат деления единиц на десятки: " + b/a);

    }
}