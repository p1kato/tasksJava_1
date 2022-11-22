package Task15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = x - y;
        if (z > 100 || z == 100) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
