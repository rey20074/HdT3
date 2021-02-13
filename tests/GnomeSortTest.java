import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GnomeSortTest {

    @Test
    void sortear() {

        int tamanovector=1000;
        Randomizador R = new Randomizador(tamanovector);
        Comparable[] list= R.lectura();

        int i=1;
        int j=2;
        Comparable tmp;

        while(i<list.length){
            if(list[i-1].compareTo(list[i])>0){
                tmp = list[i-1];
                list[i-1] =list[i];
                list[i--] = tmp;
                i = (i==0) ? j++:i;
            }else{
                i = j; j++;
            }
        }
    }
}