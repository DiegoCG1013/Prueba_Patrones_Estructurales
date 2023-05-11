package Builder;

import Composite.Componente;
import Composite.Elemento;
import Composite.Kit;

import java.util.Scanner;

public class Director {
    private ElementBuilder elementBuilder = new ElementBuilder();

    private KitBuilder kitBuilder = new KitBuilder();
    Scanner sc = new Scanner(System.in);

    public Director() {
    }

    public Elemento construirElemento() {
        System.out.println("Introduce el codigo del elemento: ");
        elementBuilder.buildCodigo(sc.nextInt());
        sc.nextLine();
        System.out.println("Introduce el precio del elemento: ");
        elementBuilder.buildPrecio(sc.nextDouble());
        sc.nextLine();
        return elementBuilder.getComponente();

    }

    public Kit construirKit() {
        System.out.println("Introduce el codigo del kit: ");
        kitBuilder.buildCodigo(sc.nextInt());
        sc.nextLine();
        System.out.println("Introduce el numero de elementos del kit: ");
        int numElementos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numElementos; i++) {
            kitBuilder.buildElemento(construirComponente());
        }
        return kitBuilder.getComponente();
    }

    public Componente construirComponente() {
        System.out.println("Quieres hacer un elemento(introduce un 1) o un kit(introduce un 2)");
        int opcion = sc.nextInt();
        sc.nextLine();
        switch (opcion) {
            case 1:
                return construirElemento();
            case 2:
                return construirKit();
            default:
                return null;
        }
    }
}