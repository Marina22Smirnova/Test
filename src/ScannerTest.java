import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer circleS = scanner.nextInt();
        Integer squareS = scanner.nextInt();

        Double squareSide = Math.sqrt(squareS);
        Double circleD = Math.sqrt(circleS);

        System.out.println("сторона квадрата " + squareSide);
        System.out.println("диаметр круга " + circleD);

    }
}