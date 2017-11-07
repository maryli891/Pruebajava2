/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava2;
import javax.swing.JOptionPane;
/**********************************************************************
 * Mariane Muñoz Gonzalez
 * Fecha 06 de Noviembre  2017
 * @author LC22
 * Clase Contraseña
 * Responsabilidad Clase principal
 
 **************************************************************************/
public class Contraseña 
{
    public static void main(String[] args)
    {
        int contador = 3;
        int numero =0;
        int clave;
        
       clave= 1313;
      
      while (numero<=3)
              {
       System.out.println(contador);
       contador++;
       
      
   
 clave = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese  su contraseña"));
      
     if (contador==1313){ 
JOptionPane.showMessageDialog(null," Contraseña correcta");
} 

else 
         
                 {--contador; 
                 
             JOptionPane.showMessageDialog(null,"Contraseña incorrecta, le queda "+contador+ "intentos");
         }
    clave = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese  nuevamente su contraseña"));  
 if (numero!=1313){ 
JOptionPane.showMessageDialog(null," Contraseña Incorrecta");
} 

else 
         
                 {--contador; 
                 
             JOptionPane.showMessageDialog(null,"Contraseña incorrecta, le queda "+contador+ "intentos");
         }
      
 numero= Integer.parseInt(JOptionPane.showInputDialog(" Ingrese nuevamente su contraseña"));   
 if (numero==3){ 
JOptionPane.showMessageDialog(null," Contraseña Incorrecta");
} 

else 
         
                 {--contador; 
                 
             JOptionPane.showMessageDialog(null, "Cuenta Bloqueada, comuniquese con Soporte Tecnico");
         }





      }
             
    }
}
