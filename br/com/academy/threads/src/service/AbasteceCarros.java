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
        for (Car car : carros) {
            try {
                System.out.println("Abastecendo carro: " + car.getId());
                Thread.sleep(5000);
                factory.abastecerCar(car);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
