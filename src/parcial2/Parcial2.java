
package parcial2;


public class Parcial2 {

    
    public static void main(String[] args) {
    
        Criatura dragon = new Dragon (" Rafaga de Escamas "," Power ", 100, 80);
        Criatura mago = new Mago (" Hechizo de Invisbilidad "," Gargamel ", 100, 40);
        Criatura guerrero = new Guerrero (" Gran Escudo "," Hercules ", 100, 20);
        
        
     simularBatalla(mago, dragon);
     
     System.out.println("\n------------------------------\n");
     
     simularBatalla(dragon,guerrero);
     
     System.out.println("\n------------------------------\n");
     
     simularBatalla(mago,guerrero);
    }
    
    
    public static void simularBatalla(Criatura c1, Criatura c2){ 
        System.out.println(" Comienza la batalla entre " + c1.getNombre()+ " y " + c2.getNombre());
    int ronda=1;
    
    while(c1.estaViva() && c2.estaViva()){
        System.out.println(" Ronda " + ronda);
        
        c1.atacar(c2);
        if (!c2.estaViva()) {
            System.out.println(c2.getNombre() + "ha muerto su salud a llegado a 0");
             break;
        }
            c2.atacar(c1);
            if (!c1.estaViva()){
            System.out.println(c1.getNombre()+ "ha muerto su salud a llegado a 0");
             break;
            }
               ronda= ronda+ 1;
    }
        System.out.println(" La batalla termino ");
        
        if(c1.estaViva()){
            System.out.println(c1.getNombre() + " ha ganado contra " + c2.getNombre());
        } else
            
        {
       System.out.println(c2.getNombre() + " ha ganado contra " + c1.getNombre());
        }
    }
}
    
