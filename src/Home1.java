import java.util.Scanner;
public class Home1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer scores = scanner.nextInt();

        if (scores == 3) {
            System.out.println("Выигрыш");

        } else if (scores == 1) {
            System.out.println("Ничья");


        }
        else{
            System.out.println("Проигрыш");
        }
    }
}