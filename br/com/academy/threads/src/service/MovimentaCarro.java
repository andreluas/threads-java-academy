package br.com.academy.threads.src.service;

import br.com.academy.threads.src.model.Car;

public class MovimentaCarro implements Runnable {

    private Car car;

    public MovimentaCarro(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (car.getCombustivel() > 0) {
                    System.out.println("Movendo carro: " + car.getId() + " combustivel: " + car.getCombustivel());
                    car.move();
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
