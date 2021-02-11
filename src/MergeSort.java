public class MergeSort {


    Comparable[] merge(Comparable arr[])
    {
        int l=0;
        int r=arr.length-1;
        int m =(int) (r/2);
        int n1 = m - l + 1;
        int n2 = r - m;

        /**Creacion de arreglos*/
        Comparable[] L=new Comparable[n1];
        Comparable[] R=new Comparable[n2];

        /**Copiar arreglo a extremidades de arreglos*/
        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        /**Merge de los sorts*/

        int i = 0;
        int j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j])<0) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /**Agregar L sort a arreglo princiapl*/
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /**Agregar R sort a arreglo princiapl*/
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        return arr;
    }
}
