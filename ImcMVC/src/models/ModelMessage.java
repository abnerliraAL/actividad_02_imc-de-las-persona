
package models;

import javax.swing.JOptionPane;


public class ModelMessage {
    private int imc;
     private int peso;
      private double estatura;

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getImc() {
        return imc;
    }

    public void setImc(int imc) {
        this.imc = imc;
    }

    
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

  
    
    public int CIMC(){
        
        this.imc=(int) (this.peso/(this.estatura*this.estatura));
        JOptionPane.showMessageDialog(null, "Su IMC es: "+imc);
        if (imc<18.5) {
            JOptionPane.showMessageDialog(null," ESTA BAJO PESO");
        } else if (imc>=18.5 && imc<=24.9) {
            JOptionPane.showMessageDialog(null, " ESTA NORMAL");
        } else if (imc>=25 && imc<=29.9) {
            JOptionPane.showMessageDialog(null, "ESTA EN SOBREPESO");
        } else {
            JOptionPane.showMessageDialog(null, "TIENE OBESIDAD");
        }
        return this.imc;
        
    }
     
}
