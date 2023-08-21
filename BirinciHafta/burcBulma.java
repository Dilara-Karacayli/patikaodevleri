import java.util.Scanner;

public class burcBulma {
    public static void main(String[] args) {
        //Değişken tanımı yapıyoruz.
        int month, day;
        String burc = " ";
        boolean isError = false;

        //Scanner tanımı yapıyoruz.
        Scanner ogrenme=new Scanner(System.in);

        //Kullanıcıdan doğduğu ayı ve günü öğreceğimiz kod bloğu.
        System.out.print("Doğduğunuz ayı rakam ile belirtiniz(1-Ocak ... 12-Aralık): ");
        month=ogrenme.nextInt();

        System.out.print("Doğduğunuz Günü giriniz: ");
        day=ogrenme.nextInt();

        //Girilen ay ve güne göre hangi burç olduğunu gösteren kod bloğu.
        if(month==1){
        if((day>=1) && (day<=31)){
            
                if(day < 22){
                    burc = "Oğlak";
                }
                else {
                    burc="Kova";
                }
                 
            }

           else{
            isError = true;
        }
        
        }else if(month==2){
            if((day>=1) && (day<=29)){
                if(day<20){
                    burc = "Kova ";
                }else{
                    burc = "Balık";
                }
                
            }

             else{
            isError = true;
        }
            
        }else if(month==3){
            if((day>=1) && (day<=31)){
                if(day<21){
                    burc = " Balık";
                }else{
                    burc = "Koc";
                }
            }

             else{
            isError = true;
        }

        }else if(month==4){
            if((day>=1) && (day<=30)){
                if(day<22){
                    burc = "Koc";
                }else{
                    burc = "Boga";
                }
            }

             else{
            isError = true;
        }

        }else if(month==5){
            if((day>=1) && (day<=31)){
                if(day<22){
                    burc = " Boga";
                }else{
                    burc = "İkizler";
                }
            }

             else{
            isError = true;
        }

        }else if(month==6){
            if((day>=1) && (day<=30)){
                if(day<23){
                    burc = " İkizler";
                }else{
                    burc = "Yengeç";
                }
            }

             else{
            isError = true;
        }
        }else if(month==7){
            if((day>=1) && (day<=31)){
                if(day<23){
                    burc = " Yengeç";
                }else{
                    burc = "Aslan";
                }
            }

             else{
            isError = true;
        }
        }else if(month==8){
            if((day>=1) && (day<=30)){
                if(day<24){
                    burc = " Aslan";
                }else{
                    burc = "Başak";
                }
            }

             else{
            isError = true;
        }
        }else if(month==9){
            if((day>=1) && (day<=30)){
                if(day<24){
                    burc = " Başak";
                }else{
                    burc = "Terazi";
                }
            }

             else{
            isError = true;
        }
        }else if(month==10){
            if((day>=1) && (day<=31)){
                if(day<22){
                    burc = " Terazi";
                }else{
                    burc = "Akrep";
                }
            }

             else{
            isError = true;
        }
        }else if(month==11){
            if((day>=1) && (day<=30)){
                if(day<22){
                    burc = " Akrep";
                }else{
                    burc = "Yay";
                }
            }

             else{
            isError = true;
        }
        }else if(month==12){
            if((day>=1) && (day<=31)){
                if(day<23){
                    burc = " Yay";
                }else{
                    burc = "Oğlak";
                }
            }

             else{
            isError = true;
        }
        }
         if(isError){
            System.out.print("Hatalı giriş yaptınız yeniden deneyiniz.");
        }
        
        else{
            System.out.print("Burcunuz: "+ burc);
        }
        
    }
    
}
