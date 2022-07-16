package br.com.academy.threads.src.service;

import br.com.academy.threads.src.model.Car;

public class MovimentaCarro implements Runnable {

    private Car car;

    public MovimentaCarro(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        while (car.getCombustivel() > 0) {
            try {
                System.out.println("Movendo carro: " + car.getId());
                Thread.sleep(5000);
                car.move();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
