package u3e4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
    Main metodo = new Main();
    ClasePila p = new ClasePila();
    ClasePila p2 = new ClasePila();
    
    Scanner V = new Scanner(System.in);
    
    boolean salir = false;
    int dato;
    do {
        salir = false;
        System.out.println(
                "Metodo de una pila"
                + "\n[1]Insertar"
                + "\n[2]Eliminar"
                + "\n[3]Mostrar cima"
                + "\n[4]Generar numeros random"
                + "\n[5]Mostrar si la pila esta vacia"
                + "\n[6]Mostrar pila"
                + "\n[7]Mostrar tamaño de la pila"
                + "\n[8]Salir");
        
        int opc = V.nextInt();
        
        switch (opc) {
            case 1:
                System.out.println("Ingrese un numero");
                dato = V.nextInt();
                metodo.insertar(p, p2, dato);
                break;
                
            case 2:
                if (!p.EstaVacia()) {
                    System.out.println("Numero elimidado: " + p.Quitar());
                } else {
                    System.out.println("La pila esta vacia");
                }
                break;
                
            case 3:
                if (!p.EstaVacia()) {
                    System.out.println("Ultimo numero agregado: " + p.Cima());
                } else {
                    System.out.println("La pila esta vacia");
                }
                break;
                
            case 4:
                metodo.NumerosRandom(p, p2);
                System.out.println("Numeros random generados");
                break;
                
            case 5:
                if (p.EstaVacia()) {
                    System.out.println("La pila esta vacia");
                } else {
                    System.out.println("La pila tiene " + p.Tamanio());
                }
                break;
                
            case 6:
                if (!p.EstaVacia()) {
                    System.out.println("Pila 1: ");
                    p.MostrarPila();
                    System.out.println("\nPila 2: ");
                    p2.MostrarPila();
                } else {
                    System.out.println("La pila esta vacia");
                }
                break;
                
            case 7:
                System.out.println("Tamaño de la pila: " + p.Tamanio());
                break;
                
            case 8:
                salir = true;
                break;
                
            default:
                System.out.println("Opcion no valida");
                break;
        }
        System.out.println("");
    } while (!salir);
}

public void NumerosRandom(ClasePila p, ClasePila p2) {
    for (int i = 0; i < 10; i++) {
        int ram = ((int) (Math.random() * 500) + 50);
        insertar(p, p2, ram);
    }
}

public void insertar(ClasePila p, ClasePila p2, int d) {
    if (p.EstaVacia()) {
        p.Agregar(d);
    } else {
        int cima = p.Quitar();
        if (d >= cima) {
            p.Agregar(cima);
            p.Agregar(d);
        } else {
            p.Agregar(cima);
            p2.Agregar(d);
        }
    }
    }   
}
