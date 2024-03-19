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
public class AnimasiFrame {
    private JFrame frame;
    private JTextField namaField, timField, aField, bField, cField, dField;
    
    public void run(){
        frame = new JFrame("Animasi Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel(new GridLayout(2,6));
        JLabel timLabel = new JLabel("TIM : ");
        JLabel alurLabel = new JLabel("Nilai Alur Cerita : ");
        JLabel kontenLabel = new JLabel("Konten : ");
        JLabel kreativitasLabel = new JLabel("Kreatifitas : ");
        JLabel sinematografiLabel = new JLabel("Sinematografi : ");
        aField = new JTextField(10);
        bField = new JTextField(10);
        cField = new JTextField(10);
        dField = new JTextField(10);
        JButton hasilButton = new JButton("Hasil Akhir");
        hasilButton.addActionListener(new HasilAkhirListener());
        
        panel.add(timLabel);
        panel.add(timField);
        panel.add(alurLabel);
        panel.add(aField);
        panel.add(kontenLabel);
        panel.add(bField);
        panel.add(kreativitasLabel);
        panel.add(cField);
        panel.add(sinematografiLabel);
        panel.add(dField);
        panel.add(hasilButton);
        
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        
    }
    private class HasilAkhirListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String tim = timField.getText();
            double a = Double.parseDouble(aField.getText());
            double b = Double.parseDouble(bField.getText());
            double c = Double.parseDouble(cField.getText());
            double d = Double.parseDouble(dField.getText());
            
            double hasil = (a*(15)+b*(35)+c*(35)+d*(15))/100;
            
            if (hasil >= 85 ){
                JOptionPane.showMessageDialog(null,"Tim dengan nama " + tim +  " dinyatakan Lolos dengan nilai akhir " + hasil);
            } else {
                JOptionPane.showMessageDialog(null, "Tim dengan nama " + tim + " dinyatakan Tidak Lolos dengan nilai akhir " + hasil);
            }
        }
    }
}
