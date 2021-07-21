import jade.core.Agent;
import jade.core.behaviours.*;
public class Agentefuncion extends Agent{
    protected void setup(){
        System.out.println("Ejcutando comportamientos");
        //aqui se dbe add los comportamientos
        addBehaviour(new Comporta1());
    }
    //aqui vamos a add un comportamiento
    private class Comporta1 extends Behaviour{
        public void action(){
            System.out.println("hola soy el comportamiento 1 del agente");
            addBehaviour(new Comporta2());
        }
        public boolean done(){
            return true;
        }
    }
    //aqui vamos a add un comportamiento 2
    private class Comporta2 extends Behaviour{
        public void action(){
            System.out.println("hola soy el comportamiento 2 del agente");
            addBehaviour(new Comporta3());
        }
        public boolean done(){
            return true;
        }
    }
 //aqui vamos a add un comportamiento 2
    private class Comporta3 extends Behaviour{
        public void action(){
            System.out.println("hola soy el comportamiento 3 del agente");
            System.out.println("Eliminando Comporta1");
            removeBehaviour(new Comporta1());//permite eliminar comportamiento
        }
        public boolean done(){
            return true;
        }
    }

    //meotodo de finalizacion del agente

}
