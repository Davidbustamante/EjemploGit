package Logica;

import java.util.Scanner;

public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur() {
    }

    public Bulbasaur(int numPokedex, String nombre, double peso, String sexo, int temporada) {
        super(numPokedex, nombre, peso, sexo, temporada);
    }
    

    @Override
    protected void atacarEmbestida() {
        System.out.println("Hola, soy Bulbasaur y este es mi ataque de embestida :)");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola, soy Bulbasaur y este es mi ataque de arañazo :)");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola, soy Bulbasaur y este es mi ataque de mordisco :)");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola, soy Bulbasaur y este es mi ataque de drenaje :)");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola, soy Bulbasaur y este es mi ataque de paralizar :)");
    }

    @Override
    protected void llenarDatos() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Agrega el Numero del Pokedex: ");
        setNumPokedex(teclado.nextInt());
        System.out.println("Agrega el nombre de Bulbasaur: ");
        teclado = new Scanner(System.in);
        setNombre(teclado.nextLine());
        System.out.println("Agrega el peso de Bulbasaur: ");
        teclado = new Scanner(System.in);
        setPeso(teclado.nextDouble());
        System.out.println("Agrega el sexo de Bulbasaur: ");
        teclado = new Scanner(System.in);
        setSexo(teclado.nextLine());
        System.out.println("Agrega la temporada: ");
        teclado = new Scanner(System.in);
        setTemporada(teclado.nextInt()); 
    }
    
}
