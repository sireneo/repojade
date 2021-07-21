import jade.core.Agent;
import jade.core.behaviours.*;
 public class MiAgente extends Agent{
     protected void setup(){
    //Aqui es donde se añade el comportamiento.
        addBehaviour(new MiComportamiento1());
    }
    //Este es el comportamiento.
    private class MiComportamiento1 extends Behaviour{
        public void action(){
        System.out.println("Mi nombre es: "+getName() );
            System.out.println("Soy el comportamiento del agente");
        }
        public boolean done(){
            return true;
        }
    }
    protected void takeDown(){
         System.out.println("Finalizando!!!!!");
    }
}
