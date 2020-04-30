/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugando_procesos_JAA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author The Test
 */
public class jugandoProcess {
    
   public static void ejecutaDir(){
       try {
           Process p =Runtime.getRuntime().exec("tasklist.exe");
           InputStream is=p.getInputStream();
           BufferedReader br= new BufferedReader(new InputStreamReader(is));
           String aux=br.readLine();
           
           while(aux!=null){
               System.out.println(aux);
               aux=br.readLine();
           }
       } catch (IOException ex) {
           Logger.getLogger(jugandoProcess.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    
    public static void main (String []args){
        
        ejecutaDir();
    
}
}