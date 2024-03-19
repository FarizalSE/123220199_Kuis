/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123220199_kuis;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Lab Informatika
 */
public class PenilaianGUI {
    private JFrame frame;
    
    public void run() {
        frame = new JFrame("Penilaian Lomba");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel(new GridLayout(2,1));
        
        JButton animasiButton = new JButton("Animasi");
        animasiButton.addActionListener(new AnimasiListener());
        JButton menulisButton = new JButton("Menulis Surat");
        menulisButton.addActionListener(new MenulisListener());
        
        
        mainPanel.add(animasiButton);
        mainPanel.add(menulisButton);
        
        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);
                    
        }
    private class AnimasiListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                AnimasiFrame animasiFrame = new AnimasiFrame();
                animasiFrame.run();
            }
    }
    
    private class MenulisListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            MenulisSuratFrame menulissuratFrame = new MenulisSuratFrame();
            menulissuratFrame.run();
        }
    }
}
