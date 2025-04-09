
package parcial2;


public class Parcial2 { // se declara la clase principal (main)

    
    public static void main(String[] args) {
    // se realiza la declaracion de los objetos con su respetivos atributos
        Criatura dragon = new Dragon (" Rafaga de Escamas "," Power ", 100, 80);
        Criatura mago = new Mago (" Hechizo de Invisbilidad "," Gargamel ", 100, 40);
        Criatura guerrero = new Guerrero (" Gran Escudo "," Hercules ", 100, 20);
        
        
     simularBatalla(mago, dragon);
     
     System.out.println("\n------------------------------\n");
     
     simularBatalla(dragon,guerrero);
     
     System.out.println("\n------------------------------\n");
     
     simularBatalla(mago,guerrero);
    }
    
    // se declara el metodo para simular las batallas
    public static void simularBatalla(Criatura c1, Criatura c2){ 
        System.out.println(" Comienza la batalla entre " + c1.getNombre()+ " y " + c2.getNombre());
    int ronda=1;
    
   // se hace uso de ciclo  whilw para que se realice mientras ambas crituras esten vivas 
    while(c1.estaViva() && c2.estaViva()){
        System.out.println(" Ronda " + ronda);
        // se indica que la criatura1 ataca a  la criatura 2
        c1.atacar(c2);
        // se verifica despues de lataque si la criatura 2 ha muerto
        if (!c2.estaViva()) {
            System.out.println(c2.getNombre() + "ha muerto su salud a llegado a 0");
             break;
        }
        // se indica que ahora si la criatura 2 esta viva debe contraatacar a la criatura 1
            c2.atacar(c1);
            // se verifica si la criatura 1 a muerto
            if (!c1.estaViva()){
            System.out.println(c1.getNombre()+ "ha muerto su salud a llegado a 0");
             break;
            }
            // se indica que si continua viva la ronda se debe incrementar
               ronda= ronda+ 1;
    }
        System.out.println(" La batalla termino ");
        
         // se indica quien gano la batalla
        if(c1.estaViva()){
            System.out.println(c1.getNombre() + " ha ganado contra " + c2.getNombre());
        } else
            
        {
       System.out.println(c2.getNombre() + " ha ganado contra " + c1.getNombre());
        }
    }
}
    
