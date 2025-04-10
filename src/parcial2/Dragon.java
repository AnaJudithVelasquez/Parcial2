package parcial2;

public class Dragon extends Criatura { // se declara la clase dragon que hereda de criatura 
private String escamas;

// se crea el costructor para inicializar los atributos heredades y el especifo que es su forma de defensa
    public Dragon(String escamas, String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
        this.escamas = escamas;
    }

    @Override
    public void atacar(Criatura objetivo) {   // se reescribe el metodo atacar
        int daño = fuerza * 2; //calcula el daño que va causar el ataque
        System.out.println(nombre + " lanza fuego a " + objetivo.getNombre() + " causando " + daño + " de dano.");
        objetivo.defender(daño);//se llama al metodo defender del objetivo para pasar el daño calculado y que se reduzca su salud
    }

    @Override
    public void defender(int daño) { //se reescribe el metodo defender 
        int dañoRecibido = daño - 10; // indica que por su forma de defensa en el dano causado se reducira un 10 de dano
        if (dañoRecibido < 0) { // se indica que en caso que el dano sea negativo se le asignara el valor de 0
            dañoRecibido = 0; 
        }
        salud = salud - dañoRecibido; // se hace la reduccio en la salud del dano recibido
        System.out.println(nombre + " recibe " + dañoRecibido + " de dano y se defiende con su " + escamas +  " Su salud restante es: " + salud);
    } // se indica cual es su salud restante despues de la reducciom
}


    
    
    
   
