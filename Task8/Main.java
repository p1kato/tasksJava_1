package Task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if(x <= 2019){
            System.out.println("NO");
        }else if(x >= 2021){
            System.out.println("YES");
        }else if(x == 2020){
            System.out.println("ERROR");
        }
    }
}

