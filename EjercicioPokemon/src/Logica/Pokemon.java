package Logica;

import java.util.Scanner;

public abstract class Pokemon {
    
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;

    public Pokemon() {
    }

    public Pokemon(int numPokedex, String nombre, double peso, String sexo, int temporada) {
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.peso = peso;
        this.sexo = sexo;
        this.temporada = temporada;
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
    
    
    /* protected abstract void llenarDatos(){
        int numP; String nom; double peso; String sexo; int temp;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Agrega el Numero del Pokedex: ");
        numP = teclado.nextInt();
        System.out.println("Agrega el nombre: ");
        teclado = new Scanner(System.in);
        nom = teclado.nextLine();
        System.out.println("Agrega el peso: ");
        teclado = new Scanner(System.in);
        peso = teclado.nextDouble();
        System.out.println("Agrega el sexo: ");
        teclado = new Scanner(System.in);
        sexo = teclado.nextLine();
        System.out.println("Agrega la temporada: ");
        teclado = new Scanner(System.in);
        temp = teclado.nextInt();
    }*/
    
    protected abstract void llenarDatos();
    protected abstract void atacarEmbestida();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
    
    
}
