public class Main
{
    public  static  void main(String[] arg) {
        /**Declaracion de clases*/
        Randomizador R = new Randomizador();
        BubbleSort burbuja = new BubbleSort();
        GnomeSort Gnome = new GnomeSort();
        MergeSort Merge = new MergeSort();


        R.generate();
        /**Se recibe lista a ordenar*/
        Comparable[] ListaAOrdenar= R.lectura();

        /**Ordenamiento por cada sort*/
        Comparable[] a= burbuja.sortear(ListaAOrdenar);
        Comparable[] b= Gnome.sortear(ListaAOrdenar);
        Comparable[] c= Gnome.sortear(ListaAOrdenar);
        Comparable[] d =

        if (a==c)
        {
            System.out.println("Todo corercto");
        }


        //---------------Esto se debe borrar---------------------
        //---------------Prueba Sorts----------------------------
        for (int i =0;i<10;i++)
        {
            System.out.println(c[i]);
        }




    }

}
