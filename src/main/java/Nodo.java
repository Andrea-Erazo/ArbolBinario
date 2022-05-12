
public class Nodo {
    private int dato;
    private Nodo izquierda, derecha;
    
   public Nodo(int Nodo){
       this.dato = dato;
       this.izquierda = this.derecha = null;
       
   } 

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getIzquiera() {
        return izquierda;
    }

    public void setIzquiera(Nodo izquiera) {
        this.izquierda = izquiera;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
     
     public void imprimirDato() {
        System.out.println(this.getDato());
     }

    
}
