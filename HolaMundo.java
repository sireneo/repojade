import java.util.Scanner;
import jade.core.Agent;
public class HolaMundo extends Agent{
	protected void setup(){ //metodo para inicializar el agente
		Scanner leer = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int resultado = 0;
		System.out.print("Hola Mundo desde JADE!....");
		System.out.println("Mi nombre locla es: " + getLocalName()); //obtenemos el nombre locla del agente
		System.out.println("Dame un valor: ");
		a = leer.nextInt();
		System.out.println("Dame otro valor: ");
		b = leer.nextInt();
		resultado = a + b;
		System.out.println("La suma es: "+ resultado);
	}
	protected void takeDown(){ //finalizacion del agnete, liberar los recurso que esta utilizando jade respecto a al ordenador
		System.out.println("Hasta luego, chauuu.....");
	}

}
