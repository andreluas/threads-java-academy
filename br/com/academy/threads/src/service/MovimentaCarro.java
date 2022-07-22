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
				car.move();
				Thread.sleep(3000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
