
package parcial2;

    public class Guerrero extends Criatura { 

   private String arma;

    public Guerrero(String arma, String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
        this.arma = arma;
    }
   

    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza;
        System.out.println(nombre + " ataca con su espada a " + objetivo.getNombre() + " causando " + daño + " de dano ");
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
    int dañoRecibido = daño - 10;
    if (dañoRecibido < 0) {
        dañoRecibido = 0;
    
    salud = salud - dañoRecibido;
        System.out.println(nombre + " recibe " + dañoRecibido+ " bloquea un poco el daño con su " + arma + " Salud restante es: "+ salud);
       }
}
    }