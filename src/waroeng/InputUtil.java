/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package waroeng;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

/**
 * Class pembantu untuk menangani input teks
 * @author indraginanjar@gmail.com
 */
public class InputUtil {
    private InputUtil(){
    }

    /**
     * Kosongkan semua komponen teks yang ada di dalam container
     * @param container 
     */
    public static void emptyAllTextComponent(Container container){
        Component[] components = container.getComponents();
        Class<?> componentClass;
        for(int i=0; i < components.length; ++i){
            componentClass = components[i].getClass();
            if(JTextComponent.class.isAssignableFrom(componentClass)){
                ((JTextComponent)components[i]).setText(null);
            }else if(Container.class.isAssignableFrom(componentClass)){
                emptyAllTextComponent((Container) components[i]);
            }
        }
    }     

    /**
     * Periksa apakah semua komponen teks telah terisi, jika ada yang belum
     * terisi tampilkan peringatan.
     * @param frame
     * @param warningMessage
     * @return 
     */
    public static boolean isAllTextComponentFilled(JFrame frame, String warningMessage){
        JRootPane root = (JRootPane) frame.getComponent(0);
        Component[] components = root.getContentPane().getComponents();
        Class<?> componentClass;
        boolean isFilled = true;
        for(int i=0; i < components.length; ++i){
            componentClass = components[i].getClass();
            if(JTextComponent.class.isAssignableFrom(componentClass)){
                if(((JTextField)components[i]).getText().length() == 0){
                    isFilled = false;
                }
            }
        }
        if(!isFilled){
            JOptionPane.showMessageDialog(frame, warningMessage);
        }
        return isFilled;
    }  
}
