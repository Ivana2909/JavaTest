public class Zadatak3 {
    //Napisati funkciju rotirajULevo koja prima niz celih brojeva i vraca taj niz
    //zarotiran za jedno mesto u levo.
    static void Ispis(int[] niz) {
        for (int i : niz) {
            System.out.print(i + " , ");
        }
        System.out.println();
    }
    static int[] rotirajULevo(int[] niz){
        int[] noviNiz=new int[niz.length];
        noviNiz[niz.length-1]=niz[0];
        int brojac=0;
        for(int i=1;i<=niz.length-1;i++){
           noviNiz[brojac]=niz[i];
           brojac++;
        }
        return noviNiz;
    }
    public static void main(String[] args){
        int[] niz={0};
        Ispis(rotirajULevo(niz));

    }
}
