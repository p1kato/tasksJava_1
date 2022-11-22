package Task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        if(x == y && y == z && x == z){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}

