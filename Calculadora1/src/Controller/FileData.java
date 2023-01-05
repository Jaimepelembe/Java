package Controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author multi
 */
public class FileData {
    
    public void saveFile(String fileOutPut,double number) throws FileNotFoundException, IOException {
        try {
            FileOutputStream ff = new FileOutputStream(fileOutPut);
            ObjectOutputStream ss = new ObjectOutputStream(ff);

            ss.writeObject(number);
            ss.close();

        }
        catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found "+ ex);
        }
        
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error saving the file "+ ex);
        }
    }

    public Object loadFile(String fileName) throws IOException {
        Object obj = null;

        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = ois.readObject();

        } catch (FileNotFoundException ex) {
            saveFile(fileName,0);
            JOptionPane.showMessageDialog(null, "File not Founded! Restart the Calculator "+ ex);
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Class not Founded! "+ ex);
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(null, "Error "+ ex);
        }

        return obj;
    }
    
    
}
