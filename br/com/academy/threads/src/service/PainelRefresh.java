package br.com.academy.threads.src.service;

import br.com.academy.threads.src.exercise.FrameUI.Panel2;

public class PainelRefresh implements Runnable {

    private Panel2 panel;

    public PainelRefresh(Panel2 panel) {
        this.panel = panel;
    }

    @Override
    public void run() {
        while (true) {
            try {
                panel.repaint();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
