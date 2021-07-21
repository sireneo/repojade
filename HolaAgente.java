import java.util.Scanner;
import jade.core.Agent;
public class HolaAgente extends Agent
{
	protected void setup()
	{
		Scanner leer = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int resul = 0;
		 System.out.println("Introduce el primer número:");
                     num1 = leer.nextInt();

                System.out.println("Introduce el segundo número:");
                     num2 = leer.nextInt();
    		resul = num1 + num2;
		System.out.println("HOla mundo desde JASDE!!"+resul);
		System.out.println("Mi nombre es: "+ getLocalName());
	}
	protected void takeDown()
	{
		System.out.println("Good by...");
	}
} 
