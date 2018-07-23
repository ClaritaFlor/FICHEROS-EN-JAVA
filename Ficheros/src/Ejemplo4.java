import java.io.*;
public class Ejemplo4 {

	public static void main( String[] args )
    {
        // ----------------
        // Copiar todo un fichero, con bloques de 512 Kb
        // Sin ninguna comprobaci�n de errores
 
        System.out.println("Copiando fichero binario...");
        final int BUFFER_SIZE = 512*1024;
 
        try
        {
            InputStream ficheroEntrada3 = new FileInputStream( new File("fichero.in"));
            OutputStream ficheroSalida3 = new FileOutputStream( new File("fichero2.out"));
 
            byte[] buf = new byte[BUFFER_SIZE];
            int cantidadLeida;
            while ((cantidadLeida = ficheroEntrada3.read(buf, 0, BUFFER_SIZE)) > 0) 
            {
                ficheroSalida3.write(buf, 0, cantidadLeida);
            }
            ficheroEntrada3.close();
            ficheroSalida3.close();
        }
        catch (Exception errorDeFichero)
        {
            System.out.println(
                "Ha habido problemas: " +
                errorDeFichero.getMessage() );
        }
 
        System.out.println("Terminado!");
    }

}
