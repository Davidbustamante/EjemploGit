package Logica;

import java.util.Scanner;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }

    public Squirtle(int numPokedex, String nombre, double peso, String sexo, int temporada) {
        super(numPokedex, nombre, peso, sexo, temporada);
    }

    
    
    @Override
    protected void atacarEmbestida() {
        System.out.println("Hola, soy Squirtle y este es mi ataque de embestida :)");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola, soy Squirtle y este es mi ataque de arañazo :)");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola, soy Squirtle y este es mi ataque de mordisco :)");
    }

    @Override
    public void atacarHidroBomba() {
        System.out.println("Hola, soy Squirtle y este es mi ataque de HIDROBOMBA :)");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola, soy Squirtle y este es mi ataque de BURBUJA :)");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola, soy Squirtle y este es mi ataque de PISTOLA DE AGUA :)");
    }

    @Override
    protected void llenarDatos() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Agrega el Numero del Pokedex: ");
        setNumPokedex(teclado.nextInt());
        System.out.println("Agrega el nombre de Squirtle: ");
        teclado = new Scanner(System.in);
        setNombre(teclado.nextLine());
        System.out.println("Agrega el peso de Squirtle: ");
        teclado = new Scanner(System.in);
        setPeso(teclado.nextDouble());
        System.out.println("Agrega el sexo de Squirtle: ");
        teclado = new Scanner(System.in);
        setSexo(teclado.nextLine());
        System.out.println("Agrega la temporada: ");
        teclado = new Scanner(System.in);
        setTemporada(teclado.nextInt()); 
    }
    
    
    
}
