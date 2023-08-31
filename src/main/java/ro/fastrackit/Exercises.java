package ro.fastrackit;
import java.util.Random;

public class Exercises {
    public static void main(String[] args){
//    System.out.println(suma(new int[]{1,2,3,4,5}));
//    System.out.println(impar(new int[]{1,2,3,4,5}));
//    int[] numere = {1,2,3,4,5};
//    int numarComparatie = 3;
//    int[] sirVerificare = verificare(numere, numarComparatie);
//    for (int numar : sirVerificare){
//        System.out.println(numar);
//        donatii(1000, 10);
        despartireFraza("Astazi e joi. Maine nu mai e joi. Marc nu e joi. Joi.");
        
    }



    public static int suma(int[] sirNumere){
        int sum = 0;
        for (int numar : sirNumere){
            sum += numar;
        }
        return sum;
    }
    public static int impar(int[] sirNumere){
        int sum = 0;
        for (int numar : sirNumere) {
            if (numar % 2 != 0){
                sum += numar;
            }
        }
        return sum;
    }
    public static int[] verificare(int[] sirNumere, int numarVerificare){
        int[] sirNumereMari = new int[sirNumere.length];
        int i = 0;
        for (int numar : sirNumere){

            if (numar > numarVerificare){
                sirNumereMari[i] = numar;

            }
            i++;
        }
        return sirNumereMari;
    }

    public static void donatii(int targetDonatii, int nrMaximDonatii) {
        Random rand = new Random();
        int sumaDonatii = 0;
        int nrDonatii = 0;

        while (sumaDonatii < targetDonatii && nrDonatii <= nrMaximDonatii) {


            int donatie = rand.nextInt(100);
            sumaDonatii += donatie;
            nrDonatii ++;
            System.out.println("Donatia nr: " + nrDonatii +
                    " este de: " + donatie);

            if (nrDonatii == nrMaximDonatii){
                System.out.println("Campania s-a incheiat cu un nr de: " + nrMaximDonatii + " donatii" +
                        " ,avand suma totala de: " + sumaDonatii);
                break;
            }

        }

    }
    public static void despartireFraza(String fraza){
        String[] propozitii = fraza.split("\\.");
        for (String propozitie : propozitii ) {
            System.out.println(propozitie.trim());
        }

    }

}



