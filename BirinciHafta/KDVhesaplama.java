import java.util.Scanner;

public class KDVhesaplama {

    public static void main(String[] args) {
        
        //değişken tanımı yapıldı.
        double kdvOrani=0.18 ,tutar;
        
        //Kullanıcıdan değer almak için Scanner tanımlandı.
        Scanner inp=new Scanner(System.in);
        System.out.println("Ücret Tutarini Giriniz: ");
        tutar=inp.nextDouble();
        //Girilen tutar ekrana yazdırılıyor.
        System.out.println(tutar);
        
        //Koşul tanımlandı ve KDV hesabı yapıldı.
        kdvOrani=(tutar<=1000) ? 0.18 : 0.8;
        double kdvTutari=tutar*kdvOrani;
        double kdvliTutar=tutar+kdvTutari;

        System.out.println(kdvliTutar);

         
        


    }
    
}
