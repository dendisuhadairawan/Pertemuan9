/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author hp
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String input1;
        String input2;
        
        int nilai1;
        int nilai2;
        int hasil;
        
        input1 = JOptionPane.showInputDialog("Masukan Angka Pertama : ");
        input2 = JOptionPane.showInputDialog("Masukan Angka kedua : ");
        
        nilai1 = Integer.parseInt(input1);
        nilai2 = Integer.parseInt(input2);
        
        hasil = nilai1 + nilai2;
        
        JOptionPane.showMessageDialog(null,nilai1+"+"+nilai2+"="+hasil);
    }
    
    
}
