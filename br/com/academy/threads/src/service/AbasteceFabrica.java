package br.com.academy.threads.src.service;

import br.com.academy.threads.src.model.Factory;

public class AbasteceFabrica implements Runnable {

    private Factory factory;

    public AbasteceFabrica(Factory factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Fabrica com: " + factory.getCombustivel() + " litros.");
                factory.abastecerFactory();
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
