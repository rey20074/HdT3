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




    }

}
