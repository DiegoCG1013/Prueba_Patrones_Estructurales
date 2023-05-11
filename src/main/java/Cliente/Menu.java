package Cliente;

import Builder.Director;
import Composite.Componente;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Componente> componentes = new ArrayList<Componente>();
    private static Director director = new Director();
    public static void menu() {
        boolean bucle = true;
        while (bucle){
        System.out.println("Quieres hacer un componente(introduce un 1) o salir(introduce un 2)");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        switch (opcion) {
            case 1:
                componentes.add(director.construirComponente());
                verComponentes();
                break;
            case 2:
                bucle = false;
                break;
        }
        return;
        }

    }

    public static void verComponentes(){
        for (Componente componente : componentes) {
            System.out.println("\n" + componente.getCodigo() + " " + componente.getPrecio());
        }
    }
}
