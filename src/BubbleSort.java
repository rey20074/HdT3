public class BubbleSort {
    //Codigo obtenido de GeeksforGeeks
    public  Comparable[] sortear(Comparable[] ordenar)
    {
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
        return ordenar;
    }

}
