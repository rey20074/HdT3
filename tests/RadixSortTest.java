import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RadixSortTest {

    int getMax(Comparable[] list,int n) {
        int mx = (int) list[0];
        for (int i = 1; i < n; i++)
            if ((int) list[i] > mx)
                mx = (int) list[i];
        return mx;
    }

    void countSort(Comparable[] list, int n, int exp) {
        Comparable output[] = new Comparable[n];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
        for (i = 0; i < n; i++)
            count[((int) list[i] / exp) % 10]++;
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
        for (i = n - 1; i >= 0; i--) {
            output[count[((int) list[i] / exp) % 10] - 1] = list[i];
            count[((int) list[i] / exp) % 10]--;
        }
        for (i = 0; i < n; i++)
            list[i] = output[i];
    }

    @Test
    void sortear() {

        int tamanovector=3000;
        Randomizador R = new Randomizador(tamanovector);
        Comparable[] list= R.lectura();

        int m = getMax(list, tamanovector);

        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(list, tamanovector, exp);
    }
}