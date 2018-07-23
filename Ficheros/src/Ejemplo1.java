//import java.io.BufferedWriter;
//import java.io.IOException;
import java.io.*;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Volcando a fichero de texto...");
		 
        try
        {
            BufferedWriter ficheroSalida = new BufferedWriter(new FileWriter(new File("fichero.txt")));
 
            ficheroSalida.write("Hola LAB 121");
            ficheroSalida.newLine();
            ficheroSalida.write("Este es");
            ficheroSalida.write(" un fichero de texto");
            ficheroSalida.newLine();
 
            ficheroSalida.close();
        }
        catch (IOException errorDeFichero)
        {
            System.out.println(
                "Ha habido problemas: " +
                errorDeFichero.getMessage() );
        }
	}

}
