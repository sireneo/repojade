import jade.core.Agent;
public class AgenteArgu extends Agent{
	protected void setup(){
		Object[] args = getArguments();
		if (args != null){
			System.out.println("Hola estos son mis argumetnos..");
			for (int i = 0; i < args.length; ++i){
				System.out.println("-" + args[i]);
			}
		}else {
			System.out.println("No hay argumentos...!");
		}
	}
	protected void takeDown(){
		System.out.println("Hasta luego...!");
	}
}
