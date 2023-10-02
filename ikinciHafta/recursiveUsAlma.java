import java.util.Scanner;
public class recursiveUsAlma {

   
    static int us(){
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
       int a = inp.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int b = inp.nextInt();

        var resualt = 1;
        for(int i = 1; i<=b; i++){
            resualt *= a;
        }
        
        
        return resualt;
    }
    public static void main(String[] args) {

        System.out.print("Sonuç: "+us());

    }
    
}
