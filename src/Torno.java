import java.util.Random;

public class Torno extends Thread{
    public int entradas;
    public Random aleatorio = new Random();
    marcador_compartido C_contador;

    public Torno(String nombre, marcador_compartido C_contador){
        super(nombre);
        this.C_contador = C_contador;
    }

    public void run(){
        entradas = aleatorio.nextInt(501) + 500;
        C_contador.suma(entradas);


    }

    public int getEntradas() {
        return entradas;
    }


}
