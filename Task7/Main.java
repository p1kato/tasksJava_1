package Task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if(x >= 1 && x <= 4){
            System.out.println("Beginners School");
        }else if(x >= 5 && x <= 9){
            System.out.println("Middle School");
        }else if(x >= 10 && x <= 11){
            System.out.println("High School");
        }
    }
}

