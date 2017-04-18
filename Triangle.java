import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        String asteriks = "*";
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            System.out.println(asteriks);
            asteriks = asteriks + "*";
        }

    }

}
