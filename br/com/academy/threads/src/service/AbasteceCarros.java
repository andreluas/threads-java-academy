package br.com.academy.threads.src.service;

import java.util.List;

import br.com.academy.threads.src.model.Car;
import br.com.academy.threads.src.model.Factory;

public class AbasteceCarros implements Runnable {

    private Factory factory;
    private List<Car> carros;

    public AbasteceCarros(Factory factory, List<Car> carros) {
        this.factory = factory;
        this.carros = carros;
    }

    @Override
    public void run() {

        while (true) {
            for (Car car : carros) {
                if (car.getCombustivel() <= 0) {
                    try {
                        System.out.println("Abastecendo carro: " + car.getId());
                        factory.abastecerCar(car);
                        System.out.println("Carro ID: " + car.getId() + " abastecido");
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
