package waroeng;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.text.JTextComponent;

/**
 *
 * @author indra
 */
public class NamaBarangVerifier extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        JTextComponent textInput = (JTextComponent) input;
        if(!textInput.getText().isEmpty()){
            try{ 
                Statement statement = DatabaseUtil.getConnection().createStatement();
                ResultSet resultSet = statement.executeQuery(
                        "SELECT count(*) FROM barang WHERE nama = \""
                        + textInput.getText()
                        + "\"");
                if(resultSet.next()){
                    if(resultSet.getInt("count(*)") == 1){
                        return true;
                    }
                }
            }catch(SQLException ex){
                System.err.println("NamaBarangVerifier.verify():\n" + ex.getMessage());
            }
        }
        return false;
    }
    
}
