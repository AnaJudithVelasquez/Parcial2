package parcial2;

public class Dragon extends Criatura { // se declara la clase dragon que hereda de criatura 
private String escamas;

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
    public void defender(int daño) {
        int dañoRecibido = daño - 10; //
        if (dañoRecibido < 0) {
            dañoRecibido = 0;
        }
        salud = salud - dañoRecibido;
        System.out.println(nombre + " recibe " + dañoRecibido + " de dano y se defiende con su " + escamas +  " Su salud restante es: " + salud);
    }
}


    
    
    
   
