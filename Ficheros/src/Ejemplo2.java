import java.io.IOException;
import java.io.*;

public class Ejemplo2 {

	public static void main( String[] args )
    {
        // Volcar a un fichero las l�neas de otro (de texto)
        // que empiecen por "A"
        // Errores: s�lo se comprueba si no existe el de origen
 
        if (! (new File("fichero.txt")).exists() )
        {
            System.out.println("No he encontrado fichero.txt");
            return;
        }
 
        System.out.println("Leyendo fichero de texto...");
 
        try
        {
            BufferedReader ficheroEntrada = new BufferedReader(new FileReader(new File("fichero.txt")));
 
            String linea=null;
            while ((linea=ficheroEntrada.readLine()) != null) {
                System.out.println(linea);
            }
 
            ficheroEntrada.close();
        }
        catch (IOException errorDeFichero)
        {
            System.out.println(
                "Ha habido problemas: " +
                errorDeFichero.getMessage() );
        }
	}

}
