import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        
        //Değişken tanımı yapıyoruz.
        int n1,n2,select;
        
        //Kullanıcıdan veri almak için Scanner tanımlıyoruz.
        Scanner inp=new Scanner(System.in);

        //Kullanıcıdan verileri girmesini isteyeceğimiz kodları yazıyoruz.
        System.out.print("Birinci sayıyı tamsayı olarak giriniz:");
        n1=inp.nextInt();

        System.out.print("İkinci sayıyı tamsayı olarak giriniz: ");
        n2=inp.nextInt();

        System.out.print("Seçim yapınız \n 1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme\n ");
        System.out.print("Seçiminiz: ");
        select=inp.nextInt();

        switch(select){
            case 1:
                System.out.print("Sonuç: "+ (n1+n2));
                break;

            case 2:
                System.out.print("Sonuç: "+ (n1-n2));
                break;
                
            case 3:
                System.out.print("Sonuc: "+ (n1*n2));
                break;
                
            case 4:
                if(n2==0){
                    System.out.println("Sayı değleri 0 olamaz.");
                }
                System.out.print("Sonuç: "+(n1/n2));
                break;
                
            default :
                System.out.print("Geçerli bir değer giriniz.");



        }
         


    }
    
}
