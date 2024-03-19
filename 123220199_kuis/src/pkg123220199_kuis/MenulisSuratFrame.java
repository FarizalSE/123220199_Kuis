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
public class MenulisSuratFrame {
    private JFrame frame;
    private JTextField namaField, aField, bField, cField, dField;
    
    public void run(){
        frame = new JFrame("Animasi Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel(new GridLayout(6,2));
        JLabel namaLabel = new JLabel("Nama : ");
        JLabel alurLabel = new JLabel("Struktur Surat : ");
        JLabel kontenLabel = new JLabel("Isi Surat : ");
        JLabel kreativitasLabel = new JLabel("Kreatifitas : ");
        JLabel sinematografiLabel = new JLabel("Penerapan Kaidah Bahasa : ");
        namaField = new JTextField(10);
        aField = new JTextField(10);
        bField = new JTextField(10);
        cField = new JTextField(10);
        dField = new JTextField(10);
        JButton hasilButton = new JButton("Hasil Akhir");
        hasilButton.addActionListener(new HasilAkhirListener());
        
        panel.add(namaLabel);
        panel.add(namaField);
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
            String nama = namaField.getText();
            double a = Double.parseDouble(aField.getText());
            double b = Double.parseDouble(bField.getText());
            double c = Double.parseDouble(cField.getText());
            double d = Double.parseDouble(dField.getText());
            
            double hasil = (a*(10)+b*(40)+c*(30)+d*(20))/100;
            
            if (hasil >= 85 ){
                JOptionPane.showMessageDialog(null,"Tim dengan nama " + nama +  " dinyatakan Lolos dengan nilai akhir " + hasil);
            } else {
                JOptionPane.showMessageDialog(null, "Tim dengan nama " + nama + " dinyatakan Tidak Lolos dengan nilai akhir " + hasil);
            }
           
        }
    }
}
