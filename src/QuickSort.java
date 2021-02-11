public class QuickSort
{
    //Codigo obtenido de GeeksforGeeks
    int Quick(Comparable arr[], int low, int high)
    {
        Comparable pivot = arr[high];
        int i = (low-1); // Indice del objeto mas pequeno
        for (int j=low; j<high; j++)
        {
            // Si el elemento es mas pequeno que el pivote
            if (arr[j].compareTo(pivot) < 0)
            {
                i++;

                // intercambiar arrays
                Comparable temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // intercambiar arr[i+1] y arr[high] (o el pivote)
        Comparable temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }


    /* La funcion principal que corre el sort*/
    Comparable[] sortear(Comparable arr[], int low, int high)
    {

        if (low < high)
        {
            int pi = Quick(arr, low, high);
            sortear(arr, low, pi-1);
            sortear(arr, pi+1, high);
        }
        return arr;
    }
}
