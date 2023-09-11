import java.util.Scanner;

public class ucvedortebolunme {
    
    public static void main(String[] args) {
        
        //Değişken tanımlaması yapılıyor.
        int k , i,toplam=0;
        int adet=0;
        double ort;

        //Scanner tanımı yapılıyor.
        Scanner inp=new Scanner(System.in);

        //Kullanıcıdan veri girişi istenecek.
        System.out.print("Hesaplatmak istediğiniz değeri giriniz: ");
        k=inp.nextInt();

        //3 ve 4 e bölünen sayıları bularak ortalamasını alan kod bloğu.
        for(i=0; i<=k; i++){
          
            if((i % 3 == 0) && (i % 4 == 0)){
                
                 toplam+=i;
                 adet++;
                System.out.println(i);
                

            }
        }
        
        ort=toplam/adet;
        System.out.println("3 ve 4 e bölünen sayıların toplamı: " +toplam);
        System.out.print("3 ve 4 e bölünen sayıların ortalaması: " +ort);

    }
    
}
