package ut1p2;

import java.io.IOException;
import java.util.Arrays;


public class Ut1p2 {

	static public void main(String[] args) throws IOException{
		
		if (args.length <= 0) {
			System.err.println("Se necesita un programa a ejecutar");
			System.exit(-1);
		}
		
		ProcessBuilder pb = new ProcessBuilder(args);
		
		try {
			Process proceso = pb.start();
			int retorno = proceso.waitFor();
			System.out.println("La ejecución de" + Arrays.toString(args)+"devuelve" +retorno);
			System.out.println("El comando: " + pb.command());
			System.out.println("El directorio: " + pb.directory());
		}catch(IOException ex){
			System.err.println("Excepción de E/S!!");
			System.exit(-1);
		}catch(InterruptedException ex){
			System.err.println("El proceso hijo finalizó de forma incorrecta");
			System.exit(-1);
		}
		
	}
	
}
