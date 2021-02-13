import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void sortear() {

        int tamanovector=1000;
        Randomizador R = new Randomizador(tamanovector);
        Comparable[] ordenar= R.lectura();

        int tamano= ordenar.length;

        for (int i=0;i<tamano;i++)
        {
            for (int j =0;j<tamano-i-1;j++)
            {
                if(ordenar[j].compareTo(ordenar[j+1])>0)
                {
                    Comparable temp =ordenar[j];
                    ordenar[j]=ordenar[j+1];
                    ordenar[j+1]=temp;
                }
            }
        }
    }
}