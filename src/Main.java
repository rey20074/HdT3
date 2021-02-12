public class Main
{
    public  static  void main(String[] arg) {
        //-----IMPORTANTE-----
        //Para cambiar tamaño del vector cambiar esta variable
        int tamanovector=3000;

        /**Declaracion de clases*/
        Randomizador R = new Randomizador(tamanovector);
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
        Comparable[] b= Gnome.sortear(ListaAOrdenar);
        ListaAOrdenar= R.lectura();
        Comparable[] c= Merge.sortear(ListaAOrdenar);
        ListaAOrdenar= R.lectura();
        Comparable[] d = Quick.sortear(ListaAOrdenar,0,tamanovector-1);
        ListaAOrdenar= R.lectura();
        Comparable[] e = Radix.sortear(ListaAOrdenar,tamanovector);



        /**Ordenamiento por cada sort  "Lista ordenada"*/

        burbuja.sortear(ListaAOrdenar);
        Gnome.sortear(ListaAOrdenar);
        Merge.sortear(ListaAOrdenar);
        Quick.sortear(ListaAOrdenar,0,tamanovector-1);
        Radix.sortear(ListaAOrdenar,tamanovector);






    }

}
