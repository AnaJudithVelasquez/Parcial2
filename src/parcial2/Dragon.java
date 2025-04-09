
package parcial2;

   public class Dragon extends Criatura { // se declara la clase dragon que hereda de criatura 

    public Dragon(String nombre, int salud, int fuerza) {  // se genera el metodo constructor
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {   // se reescribe el metodo atacar
        int daño = fuerza * 2; //calcula el daño que va causar el ataque
        System.out.println(nombre + " lanza fuego a " + objetivo.getNombre() + " causando " + daño + " de daño.");
        objetivo.defender(daño);//se llama al metodo defender del objetivo para pasar el daño calculado y que se reduzca su salud
    }

  
       @Override
    public void defender(int daño) {
    int dañoRecibido = daño - 5; //
    if (dañoRecibido < 0) {
        dañoRecibido = 0;
    }
    salud = salud - dañoRecibido;
    System.out.println(nombre + " recibe " + dañoRecibido +  " de daño y su salud restante es: " + salud);
    }
 }



    
    
    
   
