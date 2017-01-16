package edu.femxa.val.ficheros;

public class TiempoEnJava {

    public void pierdeTiempo () throws InterruptedException
    {
        Thread.sleep(5000);
//        for (int i = 1000000; i < 2000000; i++) {
//            for (int j = 1000000; j < 2000000; j++) {
//            }
//        }
    }
    public static void main(String[] args) throws InterruptedException {
        
        TiempoEnJava tiempo = new TiempoEnJava();
        long tiempoInicial = System.currentTimeMillis();
        tiempo.pierdeTiempo();
        long tiempoFinal = System.currentTimeMillis();
        double segundos = (tiempoFinal - tiempoInicial)/1000;
        System.out.println("Tardó segundos: "+segundos);
        
    }
}