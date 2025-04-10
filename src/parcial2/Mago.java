
package parcial2;

public class Mago extends Criatura { // se declara  clase Mago que hereda de criatura 
    private String hechizos; // se declara la forma de defensa del mago
    
    // se inicializa los atributos heredados y el especifico
    public Mago(String hechizos, String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
        this.hechizos = hechizos;
    }

   
    @Override
    public void atacar(Criatura objetivo) { //se rescribe el metodo atacar
        int daño = fuerza; // se indica que el dano va a ser causado con la fuerza dada a la criatura 
        System.out.println(nombre + " lanza un hechizo a " + objetivo.getNombre() + " causando " + daño + " de dano.");
        objetivo.defender(daño); // se imprime por pantalla un mensaje que indique el total de dano causado
    }

    @Override
    public void defender(int daño) { // se reescribe el metodo defender
        int dañoRecibido = daño - 10; // indica que por su forma de defensa en el dano causado se reducira un 10 de dano
        if (dañoRecibido < 0) {
            dañoRecibido = 0;
        }
        salud = salud - dañoRecibido;
        System.out.println(nombre + " recibe " + dañoRecibido + " de dano  y se protege con su " + hechizos + " Su salud restante es : " + salud);
    } // se indica por pantalla cual es su salud restantes despues de la reduccion
}


