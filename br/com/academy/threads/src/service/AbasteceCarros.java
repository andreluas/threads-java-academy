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

    // private Car car;

    // public AbasteceCarros(Factory factory, Car car) {
    // this.factory = factory;
    // this.car = car;
    // }

    // @Override
    // public void run() {
    // while (true) {
    // try {
    // if (this.car.getCombustivel() <= 0) {
    // System.out.println("Abastecendo carro: " + car.getId());
    // Thread.sleep(2000);
    // factory.abastecerCar(car);
    // System.out.println(car.getId() + "abastecido");
    // }
    // } catch (InterruptedException e) {
    // e.printStackTrace();
    // }
    // }
    // }
}
