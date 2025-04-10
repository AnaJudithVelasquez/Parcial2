
package parcial2;

// Se declara la clase abstracta y sus atributos 
public abstract class Criatura {
    String nombre; // este alamcena el nombre de la criatura
    int salud; // este alamcena la salud de la criatura
    int fuerza; //este alamcena la fuerza  de la criatura
    
// se realiza el contructor para inicializar los atributos de la clase
    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }
//se realiza los gets de la variable salud y nombre para asi obtenr los valores de estos 
    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }
    
    
    // se declaran los metodos abstractos para ser utilizados en las subclases 
    abstract void atacar(Criatura objetivo);
    
    abstract void defender(int daño);
    
    //  se crea un metodo para validar si la criatura sigue viva
    public boolean estaViva(){
        return salud > 0;
    
    
    }
    
}
