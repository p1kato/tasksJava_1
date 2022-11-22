package Task14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if(x % 3 == 0 || x % 5 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
