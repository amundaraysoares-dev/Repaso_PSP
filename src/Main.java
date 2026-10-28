void main() {
    int marcador = 0;
    marcador_compartido total = new marcador_compartido();
    List<Torno> tornos = new ArrayList<>();
    for (int i = 1;i<=4; i++){
        Torno torno = new Torno("Torno-"+i+":",total);
        tornos.add(torno);
        torno.start();

    }

    for (Torno h : tornos){

        try{
            h.join();

            marcador  = marcador + h.getEntradas();


            System.out.println(h.getName()+h.getEntradas());




        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }
    System.out.println("Marcador del estadio:" + marcador);
    System.out.println("suma de tornos: " + total.getTotal());


}
