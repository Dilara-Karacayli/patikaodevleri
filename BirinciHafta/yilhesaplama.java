import java.util.Scanner;

public class yilhesaplama {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        int yil;

        Scanner artik = new Scanner(System.in);

        System.out.println("Yılı Giriniz: ");
        yil=artik.nextInt();

        if(!(yil%400 == 0)){
            if(!(yil%100 == 0)){
                if(!(yil%4 == 0)){
                    System.out.println("Artik Yıldır.");
                }else{
                    System.out.println("Artık Yıl Değildir.");
                }
            }else{
                    System.out.println("Artık Yıl Değildir.");
                }
        }else{
                    System.out.println("Artık Yıl Değildir.");
                }
    }
    
}
