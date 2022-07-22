package br.com.academy.threads.src.service;

import br.com.academy.threads.src.exercise.FrameUI.Panel2;

public class AtualizaPainel implements Runnable {
	
	private Panel2 panel;

	@Override
	public void run() {
		while(true) {
			panel.repaint();
		}
		
	}

}
