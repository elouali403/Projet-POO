package Controller;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javax.swing.JOptionPane;

import Connection.ConnectionMySQL;
import javafx.event.ActionEvent;

public class securiteController {
	@FXML
	private TextField ac;
	@FXML
	private TextField nv;
	@FXML
	private TextField nv2;
	@FXML
	private Button enregister;

	// Event Listener on Button[#enregister].onAction
	@FXML
	public void enregistrer(ActionEvent event) throws Exception {
		// TODO Autogenerated
			// TODO Autogenerated
			ConnectionMySQL x = new ConnectionMySQL();
			if(ac.getText().equals("") || nv.getText().equals("") || nv2.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Vauiller remplir tous les champs ");
			}else {
				x.insererMotpass(nv.getText(), nv2.getText(),ac.getText());
				nv.setText(null);
				nv2.setText(null);
				ac.setText(null);
			}
			
		}
}