import java.util.Scanner;

public class uslusayi {
    public static void main(String[] args) {
        int n , k;

        Scanner inp=new Scanner(System.in);

        System.out.print("Üssü alınacak sayi: ");
        n=inp.nextInt();

        System.out.print("Üs olacak sayi");
        k=inp.nextInt();

        int us=1;

        for(int i=0; i<k; i++){
            us*=n;
        }

        System.out.print("Sonuç: "+us);
    }
    
}
