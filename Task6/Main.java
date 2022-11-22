package Task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        if(x != y){
            System.out.println(x + y);
        }else{
            System.out.println("0");
        }
    }
}



