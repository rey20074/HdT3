public class Main
{
    public  static  void main(String[] arg) {
        //-----IMPORTANTE-----
        int tamañovector=10;

        /**Declaracion de clases*/
        Randomizador R = new Randomizador(tamañovector);
        BubbleSort burbuja = new BubbleSort();
        GnomeSort Gnome = new GnomeSort();
        MergeSort Merge = new MergeSort();
        QuickSort Quick = new QuickSort();
        RadixSort Radix = new RadixSort();


        R.generate();
        /**Se recibe lista a ordenar*/
        Comparable[] ListaAOrdenar= R.lectura();

        /**Ordenamiento por cada sort "Lista desordenada"*/
        Comparable[] a= burbuja.sortear(ListaAOrdenar);

        ListaAOrdenar= R.lectura();
        //Comparable[] b= Gnome.sortear(ListaAOrdenar);
        //ListaAOrdenar= R.lectura();
        Comparable[] c= Merge.sortear(ListaAOrdenar);
        ListaAOrdenar= R.lectura();
        Comparable[] d = Quick.sortear(ListaAOrdenar,0,tamañovector-1);
        ListaAOrdenar= R.lectura();
        Comparable[] e = Radix.sortear(ListaAOrdenar,tamañovector);



        /**Ordenamiento por cada sort  "Lista ordenada"*/




        //---------------Esto se debe borrar---------------------
        //---------------Prueba Sorts----------------------------
        for (int i =0;i<10;i++)
        {

            System.out.println(a[i]);
            System.out.println(c[i]);
            System.out.println(d[i]);
            System.out.println(e[i]);
        }




    }

}
