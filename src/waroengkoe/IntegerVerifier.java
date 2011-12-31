/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package waroengkoe;

import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.text.JTextComponent;

/**
 *
 * @author indra
 */
public class IntegerVerifier extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        JTextComponent formattedInput = (JTextComponent) input;
        if(!formattedInput.getText().isEmpty()){
            try{
                new Integer(formattedInput.getText());
                //formattedInput.setBackground(Color.white);
                //formattedInput.setForeground(Color.black);
                return true;
            }catch(NumberFormatException e){

            }
        }
        //formattedInput.setBackground(Color.red);
        //formattedInput.setForeground(Color.white);
        return false;
    }
    
}
