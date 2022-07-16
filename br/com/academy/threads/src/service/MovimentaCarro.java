package br.com.academy.threads.src.service;

import br.com.academy.threads.src.model.Car;

public class MovimentaCarro implements Runnable {

    private Car car;

    public MovimentaCarro(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        System.out.println("Movendo carro: " + car.getId());
        car.move();
    }
}
