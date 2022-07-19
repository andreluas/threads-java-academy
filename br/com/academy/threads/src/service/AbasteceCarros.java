package br.com.academy.threads.src.service;

import br.com.academy.threads.src.model.Car;
import br.com.academy.threads.src.model.Factory;

public class AbasteceCarros implements Runnable {

    private Factory factory;
    private Car car;

    public AbasteceCarros(Factory factory, Car car) {
        this.factory = factory;
        this.car = car;
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (car.getCombustivel() <= 0) {
                    System.out.println("Abastecendo carro: " + car.getId());
                    factory.abastecerCar(car);
                    Thread.sleep(5000);
                    System.out.println("Carro: " + car.getId() + " abastecido");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
