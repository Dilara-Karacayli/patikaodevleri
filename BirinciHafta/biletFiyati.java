import java.util.Scanner;

public class biletFiyati {
    public static void main(String[] args) {
        //Değişken tanımı yapma.
        int yas,km,yolculuk;
        double normalTutar , yasIndirimi,indirimliTutar,gidisDonusIndirim , toplamTutar;

        //Scanner tanımı yapıyoruz.
        Scanner bilet=new Scanner(System.in);

        //Kullanıcıdan veri girişi istiyoruz.
        System.out.print("Yaşınızı Giriniz: ");
        yas=bilet.nextInt();

        System.out.print("Katedilecek mesafeyi KM cinsinden giriniz: ");
        km=bilet.nextInt();

        System.out.print("Yolculuk Türünüzü Giriniz (1-> Gidiş 2->Gidiş-Dönüş)");
        yolculuk=bilet.nextInt();

       

        //Koşullara göre tutar hesaplama yaptıracağız.
        
        if((yas<12) && (yolculuk == 1)){
            normalTutar=km*0.10;
            System.out.println("Toplam ödenecek tutar: "+normalTutar);
                yasIndirimi=normalTutar*0.5;
                indirimliTutar=normalTutar-yasIndirimi;
                System.out.print("Toplam Tutar: "+indirimliTutar);
            }
            else if((yas<12) && (yolculuk==2)){
                normalTutar=km*0.10;
                System.out.println("Toplam ödenecek tutar: "+normalTutar);
                yasIndirimi = normalTutar * 0.5;  
                indirimliTutar = normalTutar - yasIndirimi;
                gidisDonusIndirim=indirimliTutar * 0.20;
                toplamTutar = (indirimliTutar - gidisDonusIndirim) * 2 ;
                System.out.print("Toplam Tutar: "+toplamTutar);  
            }
            else if((yas>12) && (yas<24) && (yolculuk==1)){
                normalTutar=km * 0.10;
                System.out.println("Toplam ödenecek tutar: "+normalTutar);
                yasIndirimi=normalTutar*0.10;
                indirimliTutar=normalTutar-yasIndirimi;
                System.out.print("Toplam Tutar: "+indirimliTutar);

            }
            else if((yas>12) && (yas<24) && (yolculuk==2)){
                normalTutar=km*0.10;
                System.out.println("Toplam ödenecek tutar: "+normalTutar);
                yasIndirimi = normalTutar * 0.10;  
                indirimliTutar = normalTutar - yasIndirimi;
                gidisDonusIndirim=indirimliTutar * 0.20;
                toplamTutar = (indirimliTutar - gidisDonusIndirim) * 2 ;
                System.out.print("Toplam Tutar: "+toplamTutar);  
            }
            else if(yas>65){
                normalTutar=km*0.10;
                System.out.println("Toplam ödenecek tutar: "+normalTutar);
                yasIndirimi=normalTutar*0.3;
                indirimliTutar=normalTutar-yasIndirimi;
                System.out.print("Toplam Tutar: "+indirimliTutar);

            }
            else if(yas>65){
                normalTutar=km*0.10;
                System.out.println("Toplam ödenecek tutar: "+normalTutar);
                yasIndirimi = normalTutar * 0.3;  
                indirimliTutar = normalTutar - yasIndirimi;
                gidisDonusIndirim=indirimliTutar * 0.20;
                toplamTutar = (indirimliTutar - gidisDonusIndirim) * 2 ;
                System.out.print("Toplam Tutar: "+toplamTutar);  
            }
        
            else{
                System.out.print("Hatalı Veri Girdiniz.");
            }
            





    }
    
}
