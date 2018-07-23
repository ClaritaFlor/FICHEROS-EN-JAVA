import java.io.*;
public class Ejemplo3 {

	public static void main( String[] args )
    {
        // Cantidad de "a" en un fichero de cualquier tipo
        // Mirando errores solo con try-catch
 
        System.out.println("Contando \"a\"...");
        int contador = 0;
 
        try
        {
            FileInputStream ficheroEntrada2 = new FileInputStream(new File("fichero.bin"));
 
            int dato;
 
            while ((dato = ficheroEntrada2.read()) != -1) {
               if (dato == 97) // Codigo ASCII de "a"
                    contador++;
            }
            ficheroEntrada2.close();
        }
        catch (Exception errorDeFichero)
        {
            System.out.println(
                "Ha habido problemas: " +
                errorDeFichero.getMessage() );
        }
 
        System.out.println("Cantidad de \"a\": " + contador);
    }

}
