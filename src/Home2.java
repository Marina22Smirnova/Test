import java.util.Scanner;
public class Home2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer radius = scanner.nextInt();
        Integer side = scanner.nextInt();

        Double circleS = Math.PI * Math.pow(radius, 2);
        Double squareS = Math.pow(side, 2);

        if (circleS > squareS) {
            System.out.println("Площадь круга больше, чем площадь квадрата");
        } else {
            System.out.println("Площадь квадрата больше, чем площадь круга");
        }
    }
}
