import java.util.Scanner;

public class Zadatak1 {
    //Napisati funkciju unosBrojeva koja omogucava korisniku da unosi cele
    //brojeve sve dok ne unese 0 i zatim ispisuje poruku:
    //1 Suma unetih brojeva je : < suma_unetih_brojeva >
    //2 Proizvod unetih brojeva je : < proizvod_unetih_brojeva >
    //3 Srednja vrednost unetih brojeva je : < srednja_vrednost_brojeva >

    static void unosBrojeva(Scanner skener){
        System.out.println("Unesite cele brojeve");
        int n=Integer.MAX_VALUE;
        double sum=0;
        int proizv=1;
        double broj=0;
        while(n!=0){
            n=skener.nextInt();
            if(n==0){
                break;
            }
            sum+=n;
            proizv*=n;
            broj++;
        }
        if(n==0){
            System.out.println("Suma unetih brojeva je: " + sum);
            if(broj==0){
                System.out.println("Srednja vrednost unetih brojeva je: 0");
                System.out.println("Proizvod unetih brojeva je: 0");
            }else{
                System.out.println("Srednja vrednost unetih brojeva je: " + (sum/broj));
                System.out.println("Proizvod unetih brojeva je: " + proizv);


            }
        }


    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        unosBrojeva(sc);
    }
}
