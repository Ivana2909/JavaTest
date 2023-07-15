public class Zadatak2 {
    //Napisati funkciju podeliPaSaberi koja prima niz celih brojeva parne
    //duzine, deli ga na dva jednaka dela i vraca niz dobijen sabiranjem ta dva niza
    //element-po-element.
    //Primer a)
    //1 Input : [1 , 2 , 3 , 4 ,

    static void Ispis(int[] niz){
        for(int i:niz){
            System.out.print(i+" , ");
        }
        System.out.println();
    }
    static int[] podeliPaSaberi(int[] niz){
        int[] niz1=new int[niz.length/2];
        int[] niz2=new int[niz.length/2];
        int[] rezultat=new int[niz.length/2];
        int brojac=0;
        for(int i=0;i<niz.length;i++) {
            if (i < niz.length / 2) {
                niz1[i] = niz[i];
            } else {
                niz2[brojac] = niz[i];
                brojac++;
            }

        }

            for(int i=0;i<rezultat.length;i++){
                rezultat[i]=niz1[i]+niz2[i];
            }

        return rezultat;
    }
    public static void main(String[] args){
        int[] niz={0,0};
        Ispis(podeliPaSaberi(niz));
    }
}
