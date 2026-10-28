public class marcador_compartido {
    public int total = 0;

    public synchronized void suma(int num){
        total = total+ num;

    }

    public int getTotal() {
        return total;
    }


}
