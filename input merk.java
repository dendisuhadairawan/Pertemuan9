/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author hp
 */
public class InputMerk1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader input = new BufferedReader (
                new InputStreamReader(System.in)) ; 
        String merk;
        System.out.println("masukan Merk : ");
        merk = input.readLine();
        System.out.println("merk motor adallah "+merk);
        
        
    }
    
}
