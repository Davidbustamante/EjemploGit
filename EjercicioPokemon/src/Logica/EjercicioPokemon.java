package Logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioPokemon {
    
    public static void main(String[] args) {
        int numP; String nom; double peso; String sexo; int temp;
    
        
        Pikachu pika = new Pikachu(1, "Pika", 1.56, "M", 1);
        System.out.println("Num Pokedex: " + pika.getNumPokedex());
        pika.atacarImpacTrueno();
        
        Pikachu pikachu = new Pikachu();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Squirtle squirtle = new Squirtle();
        
        pikachu.atacarAraniazo();
        charmander.atacarAraniazo();
        bulbasaur.atacarAraniazo();
        squirtle.atacarAraniazo();
        
       /* 
        Pikachu pikachu = new Pikachu();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Squirtle squirtle = new Squirtle();
        
        pikachu.atacarAraniazo();
        charmander.atacarAraniazo();
        bulbasaur.atacarAraniazo();
        squirtle.atacarAraniazo();
        
        List<Pokemon> lista = new ArrayList<Pokemon> ();
        lista.add(new Pikachu(1, "Pika", 1.56, "M", 1));
        lista.add(new Charmander(2, "Char", 2.1, "M", 1));
        lista.add(new Bulbasaur(3, "Bulba", 2.4, "M", 1));
        lista.add(new Squirtle(4, "Squir", 1.99, "M", 1));
        
        System.out.println("-------------- RECORRER CON FOR --------------");
        for(int i = 0; i < lista.size(); i++){
            System.out.println("|| No.: " + lista.get(i).getNumPokedex() + "\t||"
            + "\t || Nombre: " + lista.get(i).getNombre() + "\t||"
            + "\t || Peso: " + lista.get(i).getPeso() + "\t||"
            + "\t || Sexo: " + lista.get(i).getSexo() + "\t||"
            + "\t || Temporada: " + lista.get(i).getTemporada() + "   ||");
        }
        
        System.out.println("-------------- RECORRER CON FOREACH --------------");
        for(Pokemon poke:lista){
            System.out.println("|| No.: " + poke.getNumPokedex() + "\t||"
            + "\t || Nombre: " + poke.getNombre() + "\t||"
            + "\t || Peso: " + poke.getPeso() + "\t||"
            + "\t || Sexo: " + poke.getSexo() + "\t||"
            + "\t || Temporada: " + poke.getTemporada() + "   ||");
        }*/
       
        List<Pokemon> lista = new ArrayList<Pokemon> ();
        Scanner teclado = new Scanner(System.in);
        
        int opc = 0, i = 0;
        System.out.println("¿Qué POKEMON quieres crear de la siguiente lista?");
        System.out.println("1 - PIKACHU");
        System.out.println("2 - CHARMANDER");
        System.out.println("3 - BULBASAUR");
        System.out.println("4 - SQUIRTLE");
        System.out.print("No. > "); 
        opc = teclado.nextInt();
        switch(opc){
            case 1:                 
                
                lista.add(new Pikachu());
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            default:
                System.out.println("OPCIÓN NO RECONOCIDA");     
        } 
        
        for(Pokemon poke:lista){
            System.out.println("|| No.: " + poke.getNumPokedex() + "\t||"
            + "\t || Nombre: " + poke.getNombre() + "\t||"
            + "\t || Peso: " + poke.getPeso() + "\t||"
            + "\t || Sexo: " + poke.getSexo() + "\t||"
            + "\t || Temporada: " + poke.getTemporada() + "   ||");
        }
        
        
    }
     /* 
    public void llenarDatos() {
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
        }
    */
    
    
}
