
public class MergeSort {

    private static void printArray(int[] dizi){
        for(int i: dizi){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static int[] mergeSort(int[] dizi){
        if(dizi.length <= 1){
            return dizi;
        }
        int orta = dizi.length / 2;
        int[] sol = new int[orta];
        int[] sag;

        if(dizi.length % 2 == 0){
            sag = new int[orta];

        }else{
            sag = new int[orta +1];
        }
        for(int i=0; i < orta; i++){
            sol[i] = dizi[i];
        }
        for(int j =0; j<sag.length; j++){
            sag[j] = dizi[orta+j];

        }
        int[] result = new int[dizi.length];
        sol = mergeSort(sol);
        sag = mergeSort(sag);
        result = merge(sol, sag);
        return result;
    }

   
    public static void main(String args[]){
        int [] dizi = {6, 5, 8, 9, 2, 7, 3};
        System.out.println("ilk Dizi: ");
        printArray(dizi);

        dizi = mergeSort(dizi);
        System.out.println("Sıralı Dizi: ");
        printArray(dizi);



    }


}
