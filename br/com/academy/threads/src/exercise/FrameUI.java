package br.com.academy.threads.src.exercise;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import br.com.academy.threads.src.model.Car;
import br.com.academy.threads.src.model.Factory;
import br.com.academy.threads.src.service.AbasteceCarros;
import br.com.academy.threads.src.service.AbasteceFabrica;
import br.com.academy.threads.src.service.MovimentaCarro;

public class FrameUI extends JFrame {
    private static final long serialVersionUID = 1L;
    private Panel2 jPanel2;

    Factory factory = new Factory();

    public FrameUI() {
        initComponents();
    }

    private void initComponents() {
        jPanel2 = new Panel2();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        this.setContentPane(jPanel2);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1100, 600);
    }

    public void initThreadFactory() {
        Thread threadFactory = new Thread(new AbasteceFabrica(factory));
        threadFactory.start();
    }

    public void initThreadFactoryCar() {
        List<Car> carros = jPanel2.getCarros();
        for (Car car : carros) {
            Thread threadFactoryCarros = new Thread(new AbasteceCarros(factory, car));
            threadFactoryCarros.start();
        }
    }

    public void initMovimentaCarro() {
        List<Car> carros = jPanel2.getCarros();
        for (Car car : carros) {
            Thread threadFactoryMovimentaCarro = new Thread(new MovimentaCarro(car));
            threadFactoryMovimentaCarro.start();
        }
    }

    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrameUI frame = new FrameUI();
                frame.setVisible(true);

                frame.initThreadFactory();
                frame.initThreadFactoryCar();

                frame.initMovimentaCarro();
            }
        });
    }

    public class Panel2 extends JPanel {

        private List<Car> carros;

        Panel2() {
            setPreferredSize(new Dimension(800, 600));
            iniciarCarros();
        }

        private Color defineColor() {
            Random rand = new Random();
            float r = rand.nextFloat();
            float g = rand.nextFloat();
            float b = rand.nextFloat();
            return new Color(r, g, b);
        }

        private void iniciarCarros() {

            Random rand = new Random();

            // Cria 10 novos carros
            carros = new ArrayList<Car>();
            for (int i = 0; i < 3; i++) {
                Car c = new Car(rand.nextInt(10), rand.nextInt(800), rand.nextInt(600), rand.nextInt(50),
                        defineColor());
                // c.move();
                carros.add(c);
            }

            // TODO : Me ajude ! Meus carros não estão desenhando!!!
            // int i = 0;
            // while (i <= carros.size()) {
            // carros.forEach(c -> c.move());
            // Panel2.this.repaint();
            // i++;
            // }
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            for (Car c : carros) {
                c.draw(g);
            }
        }

        public List<Car> getCarros() {
            return carros;
        }
    }
}