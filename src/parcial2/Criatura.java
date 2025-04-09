
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
    
    
    abstract void atacar(Criatura objetivo);
    
    abstract void defender(int daño);
    
    
    public void estaViva(){
    
    
    }
    
}
