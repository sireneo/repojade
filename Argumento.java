import jade.core.Agent;
public class Argumento extends Agent{
	private String datos;
	protected void setup(){
		Object[] args = getArguments();
		if (args != null ){
			System.out.println("Esos son mis comportamientos");
			for (int i = 0; i < args.length; ++i){
				System.out.println("-" + args[i]);
			}
			
		}else{
			System.out.println("No se encontraron argumetnos");
		}
	}
	protected void takeDown(){
		System.out.println("Hasta pronto");
	}
}
