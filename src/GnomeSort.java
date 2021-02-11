public class GnomeSort {


    public Comparable[] sortear(Comparable[] caja)
    {
        int n=caja.length;
        int index = 0;

        while (index < n) {
            if (index == 0)
                index++;
            if (caja[index].compareTo(caja[index - 1])>=0)
                index++;
            else {
                Comparable temp =caja[index];
                caja[index]=caja[index+1];
                caja[index+1]=temp;

                index--;
            }
        }
        return caja;
    }
}
