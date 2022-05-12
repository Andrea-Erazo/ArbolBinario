

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] argumentos) {
        
             
        Arbol arbol = new Arbol();
        arbol.insertar(1);
        arbol.insertar(2);
        arbol.insertar(3);
        arbol.insertar(4);
        arbol.insertar(0);
        System.out.println("Recorriendo inorden:");
        arbol.inorden();
        System.out.println("Recorriendo postorden:");
        arbol.postorden();
        System.out.println("Recorriendo preorden:");
        arbol.preorden();
        System.out.println(arbol.existe(1)); 
        System.out.println(arbol.existe(7)); 
        System.out.println(arbol.existe(0)); 
    }
    
}
