
package parcial2;

   public class Dragon extends Criatura {

    public Dragon(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza * 2;
        System.out.println(nombre + " lanza fuego a " + objetivo.getNombre() + " causando " + daño + " de daño.");
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        int dañoRecibido = daño - 5;
        dañoRecibido = Math.max(dañoRecibido, 0);
        salud = salud-dañoRecibido;
                System.out.println(nombre + " recibe " + dañoRecibido + " de daño y su salud restante es : " + salud);
    }
}


    
    
    
   
