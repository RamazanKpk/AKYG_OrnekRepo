
public class MergeSort {

    private static void printArray(int[] dizi){
        for(int i: dizi){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static int[] merge(int[] sol, int[] sag){
        int[] result = new int[sol.length + sag.length];
        int solİndex, sagİndex,resultİndex;
        solİndex = sagİndex = resultİndex = 0;

        while(solİndex < sol.length || sagİndex < sag.length){
            if(solİndex < sol.length && sagİndex < sag.length){
                if(sol[solİndex] < sag[sagİndex]){
                    result[resultİndex++] = sol[solİndex++];
                }else{
                    result[resultİndex++] = sag[sagİndex++];
                }
            }else if(solİndex < sol.length){
                result[resultİndex++] = sol[solİndex++];
            }
            else if(sagİndex < sag.length){
                result[resultİndex++] = sag[sagİndex++];
            }
        }
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
