package br.com.academy.threads.src.model;

public class Factory {
    private int combustivel;

    public Factory() {
    }

    public Factory(int combustivel) {
        this.combustivel = combustivel;
    }

    public void abastecerFactory() {
        combustivel += 50;
        System.out.println("Fabrica abastecida | combustivel: " + combustivel);
    }

    public void abastecerCar(Car car) {

        synchronized (this) {
            if (combustivel >= 50) {
                car.setCombustivel(50);                
                combustivel -= 50;
            }else {
            	System.out.println("Fabrica sem combustivel.");
            }
        }
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }
}
