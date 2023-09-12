package fibonacciOdevi;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int k, n1=0 , n2=1 , n3;

        Scanner deger = new Scanner(System.in);
        System.out.print("Değer Giriniz: ");
        k = deger.nextInt();
        System.out.print(n1+ " " +n2);

        for(int i=0; i<k; ++i ){
            
            n3=n1+n2;
            System.out.print("  " +n3);
            n1=n2;
            n2=n3;
        }
        System.out.println();
    }
    
}
