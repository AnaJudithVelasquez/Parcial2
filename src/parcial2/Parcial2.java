
package parcial2;


public class Parcial2 {

    
    public static void main(String[] args) {
    
        Criatura dragon = new Dragon ("Power", 100, 80);
        Criatura mago = new Mago ("Gargamel", 100, 40);
        Criatura guerrero = new Guerrero ("Hercules", 100, 20);
        
        
     Parcial2.simularBatalla(mago, dragon);
     Parcial2.simularBatalla(dragon,guerrero);
     Parcial2.simularBatalla(mago,guerrero);
    }
    
    public static void simularBatalla(Criatura c1, Criatura c2){ 
        System.out.println(" Comienza la batalla entre" + c1.getNombre()+ "y" + c2.getNombre());
    int ronda=1;
    while(c1.estaViva() && c2.estaViva()){
        System.out.println("Ronda" + ronda);
        c1.atacar(c2);
        if (c2.estaViva())
            c2.atacar(c1);
            ronda++;
            break;
      
        
        }
        System.out.println(" La batalla termino ");
        if(c1.estaViva()){
            System.out.println(c1.getNombre() + " ha ganado contra" + c2.getNombre());
        } else
            
        {
       System.out.println(c2.getNombre() + " ha ganado contra" + c1.getNombre());
        }
    }
}
    


    

