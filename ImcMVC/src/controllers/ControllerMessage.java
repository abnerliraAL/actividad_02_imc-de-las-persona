
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.ModelMessage;
import views.ViewMessage;

public class ControllerMessage implements ActionListener {
    
    private final ModelMessage modelMessage;
    private final ViewMessage viewMessage;

    public ControllerMessage(ModelMessage modelMessage, ViewMessage viewMessage) {
        this.modelMessage = modelMessage;
        this.viewMessage = viewMessage;
        this.viewMessage.jb_calcular.addActionListener(this);
       
    }
    
     public final void initView(){
        viewMessage.setTitle("Calcular Imc");
        viewMessage.setLocationRelativeTo(null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if( viewMessage.jtf_estatura.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Falta Ingresar Estatura");
        } else if ( viewMessage.jtf_peso.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Falta Ingresar Peso");
        }
                
        
     modelMessage.setPeso(Integer.parseInt(viewMessage.jtf_peso.getText()));
     modelMessage.setEstatura(Double.parseDouble(viewMessage.jtf_estatura.getText()));
     modelMessage.CIMC();
      
     
     
    }

    
}
