import java.util.Scanner;

public class dortvebesinkuvvetleri {
    public static void main(String[] args) {
        int n;
        Scanner inp=new Scanner(System.in);

        System.out.print("Sınır Sayısını Giriniz: ");
        n = inp.nextInt();

        for(int i=1; i<=n; i*=4){
            
            System.out.println(i);
            
        }

        System.out.println("---------------------------------");

        for(int k=1; k<=n; k*=5){

            System.out.println(k);
        }
    }
    
}
