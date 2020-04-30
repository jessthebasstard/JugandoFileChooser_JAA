
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author The Test
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
          
            
            
            for( javax.swing.UIManager.LookAndFeelInfo tipos: javax.swing.UIManager.getInstalledLookAndFeels() ){
                if("Windows Classic".equals(tipos.getName())){
                  javax.swing.UIManager.setLookAndFeel(tipos.getClassName());  
                }
                
            }
            
            
            
            
            
            JFileChooser selectorArchivos =new JFileChooser();
            
            selectorArchivos.showSaveDialog(selectorArchivos);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ejemplo1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Ejemplo1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Ejemplo1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Ejemplo1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
