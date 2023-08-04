public class manav{

    public static void main(String[] args) {
        double armut=2.14 , elma =3.67 , domates =1.11 , muz=0.95 , patlican=5.00; //Birim fiyatlarını gösteriyor

        double toplam;

        System.out.println("Armut Kaç Kilo? :0 kg");//Kaç kilogram alındığını belirtmek için yazılan alan
        System.out.println("Elma Kaç Kilo? :1 kg");//Kaç kilogram alındığını belirtmek için yazılan alan
        System.out.println("Domates Kaç Kilo? :1 kg");//Kaç kilogram alındığını belirtmek için yazılan alan
        System.out.println("Muz Kaç Kilo? :2 kg");//Kaç kilogram alındığını belirtmek için yazılan alan
        System.out.println("Patlıcan Kaç Kilo? :3 kg");//Kaç kilogram alındığını belirtmek için yazılan alan

        toplam = elma+domates+(muz*2)+(patlican*3);//Toplam kaç TL tuttuğunun hesabı yapılıyor.
        //Hesaplamada armuttan 0 kilogram alındığı için armut yer almıyor.

        System.out.println("Toplam :  "+ toplam);
    }
    
    
}
