package Logica;

import java.util.Scanner;

public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }

    public Charmander(int numPokedex, String nombre, double peso, String sexo, int temporada) {
        super(numPokedex, nombre, peso, sexo, temporada);
    }
    
    @Override
    protected void atacarEmbestida() {
        System.out.println("Hola, soy Charmander y este es mi ataque de embestida :)");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola, soy Charmander y este es mi ataque de arañazo :)");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola, soy Charmander y este es mi ataque de mordisco :)");
    }

    @Override
    public void atacarPunioFuego() {
         System.out.println("Hola, soy Charmander y este es mi ataque de puño de fuego :)");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Hola, soy Charmander y este es mi ataque de lanzallamas :)");
    }

    @Override
    public void atacarIncandescente() {
        System.out.println("Hola, soy Charmander y este es mi ataque incandescente :)");   
    }

    @Override
    protected void llenarDatos() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Agrega el Numero del Pokedex: ");
        setNumPokedex(teclado.nextInt());
        System.out.println("Agrega el nombre de Charmander: ");
        teclado = new Scanner(System.in);
        setNombre(teclado.nextLine());
        System.out.println("Agrega el peso de Charmander: ");
        teclado = new Scanner(System.in);
        setPeso(teclado.nextDouble());
        System.out.println("Agrega el sexo de Charmander: ");
        teclado = new Scanner(System.in);
        setSexo(teclado.nextLine());
        System.out.println("Agrega la temporada: ");
        teclado = new Scanner(System.in);
        setTemporada(teclado.nextInt());
    }
    
}
