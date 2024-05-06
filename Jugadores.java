package Main;
import java.util.concurrent.atomic.AtomicInteger;

public class Jugadores {
    
    // Declaración de variables
    private static final AtomicInteger idGen = new AtomicInteger(0);
    private int id;
    private String nombre;
    private char nivel;
    private String juegoFavorito;
    private int score;

    public static int getNextID() {
        return idGen.incrementAndGet();
    }

    // Constructor
    public Jugadores(String nombre, char nivel, String juegoFavorito, int score) {

        this.id=getNextID();
        this.nombre = nombre;
        this.nivel = nivel;
        this.juegoFavorito = juegoFavorito;
        this.score = score;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public char getNivel() {
        return nivel;
    }

    public String getJuegoFavorito() {
        return juegoFavorito;
    }

    public int getScore() {
        return score;
    }

    // Setters
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void setNivel(char nuevoNivel) {
        this.nivel = nuevoNivel;
    }

    public void setJuegoFavorito(String nuevoJuegoFavorito) {
        this.juegoFavorito = nuevoJuegoFavorito;
    }

    public void setScore(int nuevoScore) {
        this.score = nuevoScore;
    }


}
