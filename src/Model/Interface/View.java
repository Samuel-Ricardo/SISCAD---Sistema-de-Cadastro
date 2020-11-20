/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Interface;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Samuel
 */
public interface View {
    
    
    public JButton getjButtonCancel();

    public void setjButtonCancel(JButton jButtonCancel);

    public JButton getjButtonSave();

    public void setjButtonSave(JButton jButtonSave);

    public JCheckBox getjCheckBoxActive();

    public void setjCheckBoxActive(JCheckBox jCheckBoxActive);

    public JComboBox<String> getjComboBoxCargo();

    public void setjComboBoxCargo(JComboBox<String> jComboBoxCargo);

    public JLabel getjLabelAddress();

    public void setjLabelAddress(JLabel jLabelAddress);

    public JLabel getjLabelCargo();

    public void setjLabelCargo(JLabel jLabelCargo);

    public JLabel getjLabelGenre();

    public void setjLabelGenre(JLabel jLabelGenre);

    public JLabel getjLabelName();

    public void setjLabelName(JLabel jLabelName);

    public JRadioButton getjRadioButtonF();

    public void setjRadioButtonF(JRadioButton jRadioButtonF);

    public JRadioButton getjRadioButtonM();

    public void setjRadioButtonM(JRadioButton jRadioButtonM);

    public JTextField getjTextFieldAddress();

    public void setjTextFieldAddress(JTextField jTextFieldAddress);

    public JTextField getjTextFieldName();

    public void setjTextFieldName(JTextField jTextFieldName);

    
}
