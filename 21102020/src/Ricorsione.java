import java.util.Arrays;

public class Ricorsione {
    public static void main(String[] args){
        int[] myArr = {103,2,4,-2};

        //System.out.println(RicercaRicorsiva(myArr, 4,0, myArr.length));
        System.out.println(Arrays.toString(MergeSort(myArr)));
        //mergeSort(myArr);
        //System.out.println(Arrays.toString(myArr));
    }

    //ricerca lineare
    public static int RicercaIndice(int[] arr, int n){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }

    public static int RicercaBinaria(int[] seq, int chiave){
        int indice;
        int inizio;int fine;int centro;
        inizio=0;
        fine=seq.length-1;
        indice=-1;
        while(indice==-1 && inizio<=fine){
            centro = (inizio+fine)/2;
            if(seq[centro]==chiave)
                indice=centro;
            else
                if(chiave>seq[centro])
                    inizio = centro +1;
                else
                    fine = centro-1;
        }
        return indice;
    }

    public static int RicercaRicorsiva(int[] seq, int chiave,int inizio, int fine){
        if(inizio>fine)
            return -1;

        int centro = (inizio+fine)/2;

        if(seq[centro]==chiave)
            return centro;

        if(chiave < seq[centro]){
            return RicercaRicorsiva(seq, chiave, inizio, centro-1);
        }
        else {
            return RicercaRicorsiva(seq, chiave, centro+1, fine);
        }

    }

    public static int[] MergeSort(int[] toOrder){
        int[] left;
        int[] right;
        int[] result = new int[toOrder.length];

        if (toOrder.length <= 1)
            return toOrder;
        int centro = toOrder.length/2;
        /*******/
        left = new int[centro];
        if(toOrder.length%2 ==0){
            right = new int[centro];
        }else{
            right = new int[centro+1];
        }
        /*******/
        for (int i = 0; i < centro; i++)
            left[i] = toOrder[i];
        /*******/

        int indiceDaInserire = 0;
        for(int i=centro; i< toOrder.length; i++){
            right[indiceDaInserire++] = toOrder[i];
        }

        /***********RICORSIONE****/
        left = MergeSort(left);
        right = MergeSort(right);
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        /**Unione*/
        result = Merge(left,right);
        return result;
    }

    public static int[] Merge(int[] l, int[] r)
    {
        int resLength = r.length+l.length;
        int[] result = new int[resLength];
        int indexLeft = 0, indexRight=0, indexResult=0;

        while (indexLeft < l.length || indexRight < l.length)
        {
            //if both arrays have elements
            if (indexLeft < l.length && indexRight < r.length)
            {
                //If item on left array is less than item on right array, add that item to the result array
                if (l[indexLeft] <= r[indexRight])
                {
                    result[indexResult] = l[indexLeft];
                    indexLeft++;
                    indexResult++;
                }
                // else the item in the right array wll be added to the results array
                else
                {
                    result[indexResult] = r[indexRight];
                    indexRight++;
                    indexResult++;
                }
            }
            //if only the left array still has elements, add all its items to the results array
            else if (indexLeft < l.length)
            {
                result[indexResult] = l[indexLeft];
                indexLeft++;
                indexResult++;
            }
            //if only the right array still has elements, add all its items to the results array
            else if (indexRight < r.length)
            {
                result[indexResult] = r[indexRight];
                indexRight++;
                indexResult++;
            }
        }
        return result;
    }

    public static void mergeSort(int[] data) {
        if(data.length <= 1) return;               // Base case: just 1 elt

        int[] a = new int[data.length / 2];        // Split array into two
        int[] b = new int[data.length - a.length]; //   halves, a and b
        for(int i = 0; i < data.length; i++) {
            if(i < a.length) a[i] = data[i];
            else             b[i - a.length] = data[i];
        }

        mergeSort(a);                              // Recursively sort first
        mergeSort(b);                              //   and second half.

        int ai = 0;                                // Merge halves: ai, bi
        int bi = 0;                                //   track position in
        while(ai + bi < data.length) {             //   in each half.
            if(bi >= b.length || (ai < a.length && a[ai] < b[bi])) {
                data[ai + bi] = a[ai]; // (copy element of first array over)
                ai++;
            } else {
                data[ai + bi] = b[bi]; // (copy element of second array over)
                bi++;
            }
        }
    }
}
