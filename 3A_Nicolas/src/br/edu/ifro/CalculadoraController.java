/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author 81608713253
 */
public class CalculadoraController implements Initializable {
    
    @FXML
    private TextField txtnumero1, txtnumero2, txtresultado;
    
    @FXML
    private Button btnsomar;
    @FXML
    private Button btnsubitraçao;
    
    @FXML
    private Button btndivisao;
    
    @FXML
    private Button btnmultiplicaçao;
     
    
    @FXML
    private void soma(ActionEvent event) {
    Double num1 = Double.parseDouble(txtnumero1.getText());
    Double num2 = Double.parseDouble(txtnumero2.getText());
    Double resultado = num1 + num2;
    
    txtresultado.setText(resultado.toString());
        
    }
    @FXML
     private void subitraçao(ActionEvent event) {
    Double num1 = Double.parseDouble(txtnumero1.getText());
    Double num2 = Double.parseDouble(txtnumero2.getText());
    Double resultado = num1 - num2;
    
    txtresultado.setText(resultado.toString());
        
    }
     @FXML
     private void divisao(ActionEvent event) {
    Double num1 = Double.parseDouble(txtnumero1.getText());
    Double num2 = Double.parseDouble(txtnumero2.getText());
    Double resultado = num1 / num2;
    
    txtresultado.setText(resultado.toString());
        
    }
     @FXML
     private void multiplicaçao(ActionEvent event) {
    Double num1 = Double.parseDouble(txtnumero1.getText());
    Double num2 = Double.parseDouble(txtnumero2.getText());
    Double resultado = num1 * num2;
    
    txtresultado.setText(resultado.toString());
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
