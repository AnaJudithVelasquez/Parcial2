
package parcial2;

public class Mago extends Criatura {
    private String hechizos;

    public Mago(String hechizos, String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
        this.hechizos = hechizos;
    }

   
    @Override
    public void atacar(Criatura objetivo) {
        int daño = fuerza;
        System.out.println(nombre + " lanza un hechizo a " + objetivo.getNombre() + " causando " + daño + " de dano.");
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        int dañoRecibido = daño - 10;
        if (dañoRecibido < 0) {
            dañoRecibido = 0;
        }
        salud = salud - dañoRecibido;
        System.out.println(nombre + " recibe " + dañoRecibido + " de dano  y se protege con su " + hechizos + " Su salud restante es : " + salud);
    }
}


