import java.io.*;
import java.util.Random;
import java.util.Scanner;

/**Clase que se encarga de generar los numeros, leer y crear el archivo*/
public class Randomizador {

    int tamaño=0;
    public Randomizador(int e)
    {
        tamaño =e;
        rnd = new Random();
    }

    Random rnd;


    public  void generate()
    {
        String acu="";
        for (int i =0; i< tamaño;i++)
        {
            acu+=rnd.nextInt(tamaño)+ "\n";
        }
        CreateFile(acu);
    }

    /**Verifica si el archivo ya existe para escribir en el*/
    private void CreateFile(String contenido)
    {
        try {
            File file = new File("Almacen.txt"); /**Creación del archivo*/

            if (!file.exists()) {
                file.createNewFile();
            }
            /**Escritura del archivo*/
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    /**Lee el archivo y regresa una lista de Comparable*/
    public Comparable[] lectura()
    {
        Comparable[] caja = new Comparable[tamaño];
        try
        {
            /**Asignación de lineas a array de Comparable*/

            File texto = new File("Almacen.txt");
            Scanner Lector = new Scanner(texto);
            for(int j=0;j<tamaño;j++)
            {

                String datos = Lector.nextLine();
                caja[j]=Integer.valueOf(datos);



            }
            Lector.close();


        }
        catch (FileNotFoundException e)
        {
            System.out.println("Archivo no encontrado");
            e.printStackTrace();
        }
        return  caja;
    }


}
