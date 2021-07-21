import java.io.*;
import jade.core.Agent;
public class Alectura extends Agent {
	public void setup() {
		Object[] args = getArguments();
		if (args == null) {
			System.out.println("Falta el nombre del fichero");
		} else {
			File f = new File((String) args[0]);
			if (!f.exists()) {
				System.out.println("El fichero no 		existe.");
			} else {
				try {
				FileReader stream = new FileReader(f);
				BufferedReader buffer = new BufferedReader(stream);
				String linea;
				while ((linea = buffer.readLine()) != null) {
					System.out.println(linea);
				}
				} catch (Exception e) { e.printStackTrace(); }
			}
		}
	}
}
