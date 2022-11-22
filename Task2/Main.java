package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        if(x % 17 == 0){
            System.out.println("DIVISIBLE BY 17");
        }
    }
}