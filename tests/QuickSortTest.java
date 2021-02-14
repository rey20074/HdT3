import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

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

    @Test
    void sortear() {

        int tamanovector=100;
        Randomizador R = new Randomizador(tamanovector);
        Comparable[] arr= R.lectura();

        if (0 < tamanovector)
        {
            int pi = Quick(arr,0, tamanovector-1);
        }

    }
}