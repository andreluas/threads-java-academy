package br.com.academy.threads.src.service;

import br.com.academy.threads.src.exercise.FrameUI.Panel2;

public class PainelRefresh implements Runnable {

    private Panel2 panel;

    public PainelRefresh(Panel2 panel) {
        this.panel = panel;
    }

    @Override
    public void run() {
        while(true) {
        	try {
				Thread.sleep(500);
				panel.repaint(); 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
               
        }
    }
}
