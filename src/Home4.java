import java.util.Scanner;
public class Home4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        double a = sc.nextDouble();
        Integer b = sc.nextInt();
        Integer c = sc.nextInt();
        if ((a<b)&(b<c)) {
            System.out.println("a<b<c");
        }
        else {
            System.out.println("Выражение a<b<c неверно");
        }
            if((b>a)&(a>c)) {
                System.out.println("b>a>c");
            }
            else {
                   System.out.println("Выражение b>a>c неверно");
                }
    }
}
