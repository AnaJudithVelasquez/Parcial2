
package parcial2;

    public class Guerrero extends Criatura { 

    public Guerrero(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza;
        System.out.println(nombre + " ataca con su espada a " + objetivo.getNombre() + " causando " + daño + " de daño");
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
    int dañoRecibido = daño - 3;
    if (dañoRecibido < 0) {
        dañoRecibido = 0;
    }
    salud = salud - dañoRecibido;
        System.out.println(nombre + " bloquea un poco el daño. Recibe " + dañoRecibido + ". Salud restante: " + salud);
       }
}
