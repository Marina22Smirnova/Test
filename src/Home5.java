import java.util.Scanner;
public class Home5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();

        Double sqrt1 = Math.sqrt(a);

        if (Math.sqrt(b) < a) {
            Double c = b * 5;
            System.out.println(c);
        }
    }
}