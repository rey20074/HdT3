public class Main
{
    public  static  void main(String[] arg) {
        /**Declaracion de clases*/
        Randomizador R = new Randomizador();
        BubbleSort burbuja = new BubbleSort();

        //-----------------------------------------

        R.generate();
        /**Se recibe lista a ordenar*/
        Comparable[] ListaAOrdenar= R.lectura();


        Comparable[] ListaOrdenada= burbuja.sortear(ListaAOrdenar);




        //---------------Esto se debe borrar---------------------
        //---------------Prueba Sorts----------------------------
        for (int i =0;i<10;i++)
        {
            System.out.println(ListaOrdenada[i]);
        }




    }

}
