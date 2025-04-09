
package parcial2;


public abstract class Criatura {
    String nombre;
    int salud;
    int fuerza;

    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }
    
    
    
    abstract void atacar(Criatura objetivo);
    
    abstract void defender(int daño);
    
    
    public boolean estaViva(){
        return salud > 0;
    
    
    }
    
}
