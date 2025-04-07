package Logica;

import java.util.Scanner;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }

    public Pikachu(int numPokedex, String nombre, double peso, String sexo, int temporada) {
        super(numPokedex, nombre, peso, sexo, temporada);
    }

    public int getNumPokedex() {
        return numPokedex;
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    
    
    @Override
    protected void atacarEmbestida() {
        System.out.println("Hola, soy Pikachu y este es mi ataque de embestida :)");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola, soy Pikachu y este es mi ataque de arañazo :)");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola, soy Pikachu y este es mi ataque de mordisco :)");
    }

    @Override
    public void atacarImpacTrueno() {
        System.out.println("Hola, soy Pikachu y este es mi ataque IMPACTRUENO :)");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola, soy Pikachu y este es mi ataque PUÑOTRUENO :)");
    }
    
    public void llenarDatos() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Agrega el Numero del Pokedex: ");
        setNumPokedex(teclado.nextInt());
        System.out.println("Agrega el nombre de Pikachu: ");
        teclado = new Scanner(System.in);
        setNombre(teclado.nextLine());
        System.out.println("Agrega el peso de Pikachu: ");
        teclado = new Scanner(System.in);
        setPeso(teclado.nextDouble());
        System.out.println("Agrega el sexo de Pikachu: ");
        teclado = new Scanner(System.in);
        setSexo(teclado.nextLine());
        System.out.println("Agrega la temporada: ");
        teclado = new Scanner(System.in);
        setTemporada(teclado.nextInt()); 
    }

}
