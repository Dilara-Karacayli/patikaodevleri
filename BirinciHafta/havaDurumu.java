import java.util.Scanner;



public class havaDurumu {

    public static void main(String[] args) {
        
        //Değişken tanımlama 
        int heat;

        //Scanner tanımı.
        Scanner inp=new Scanner(System.in);

        //Kullanıcıdan hava sıcaklığını girmesi istenenen kod
        System.out.print("Hava sıcaklığını giriniz: ");
        heat=inp.nextInt();
        
        //Hava sıcaklığına göre yapacağı etkinliği belirleyen koşul bloğu.
        
        if(heat<=5)
        {
            System.out.print("Kayak yapabilirsiniz.");

        }

        else if((heat>5) && (heat<10))
        {
            System.out.print("Sinemaya Gidebilirsiniz.");
        }
              else if((heat>=10) && (heat<=15) )
        {
            System.out.println("Sinemaya Gidebilirsiniz");
            System.out.print("Piknik Yapabilirsiniz.");
        }
        
        else if((heat>15) && (heat<25))
        {
            System.out.print("Pikniğe gidebilirsiniz.");
        }

        else if(heat>=25)
        {
            System.out.print("Yüzme yapabilirsiniz.");
        }

        }

        

        

    }
    

