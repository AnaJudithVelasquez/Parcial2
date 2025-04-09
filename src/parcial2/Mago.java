
package parcial2;


 public class Mago extends Criatura {

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza;
        System.out.println(nombre + " lanza un hechizo a " + objetivo.getNombre() + " causando " + daño + " de daño.");
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        salud = salud - daño;
        System.out.println(nombre + " recibe " + daño + " de daño  y  su salud restante es : " + salud);
    }
}


