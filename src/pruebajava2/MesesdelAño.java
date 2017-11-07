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
 * Clase Mesesdelaño
 * Responsabilidad Clase principal
 *
 ************************************************************************/
public class MesesdelAño 
{
 public static void main(String[] args)   
 {
  int numero= Integer.parseInt(JOptionPane.showInputDialog(" Ingrese un numero entre 1 y 12")); 

switch(numero) 
{
        case 1:
        JOptionPane.showMessageDialog(null,"  ES ENERO");
        break;
        
        case 2:
        JOptionPane.showMessageDialog(null," ES FEBRERO ");
        break;
        
       case 3:
        JOptionPane.showMessageDialog(null," ES MARZO ");
        break;
        
        case 4:
        JOptionPane.showMessageDialog(null," ES ABRIL ");
        break;
       
        case 5:
            
        JOptionPane.showMessageDialog(null," ES MAYO");
        break;
        
         case 6:
            
        JOptionPane.showMessageDialog(null,"  ES JUNIO");
        break;
        
         case 7:
            
        JOptionPane.showMessageDialog(null," ES JULIO");
        break;
        
         case 8:
            
        JOptionPane.showMessageDialog(null," ES AGOSTO");
        break;
        
         case 9:
            
        JOptionPane.showMessageDialog(null," ES SEPTIEMBRE");
        break;
        
         case 10:
            
        JOptionPane.showMessageDialog(null," ES OCTUBRE");
        break;
        
         case 11:
            
        JOptionPane.showMessageDialog(null," ES NOVIEMBRE");
        break;
        
        
         case 12:
            
        JOptionPane.showMessageDialog(null," ES DICIEMBRE");
        break;
}
} 
       
}
