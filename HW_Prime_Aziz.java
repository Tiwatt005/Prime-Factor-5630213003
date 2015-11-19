package hw_aziz;

import java.util.Scanner;

// Tiwat Tuppo SE 5630213003

public class HW_PrimeFactor {

 
    public static void main(String[] args) {

        int inputnumber;
        Scanner in = new Scanner(System.in);

        System.out.println("You want exit\n");
        do {
            System.out.print("Enter number : ");
            inputnumber = in.nextInt();

            System.out.print("Prime : ");
            for (int i = 2; i <= inputnumber; i++) {
                while (inputnumber % i == 0) {
                    inputnumber = inputnumber / i;
                    System.out.print(i);
                    if (inputnumber >= i) {
                        System.out.print(" x ");
                    }
                }
            }
            System.out.print("\n\n");
        } while (inputnumber != 9999);

    }

}
