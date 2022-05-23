package Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import Connection.ConnectionMySQL;
import javafx.event.ActionEvent;

import javafx.scene.control.ChoiceBox;

public class AjouterEtudController implements Initializable {
	@FXML
	private TextField nom;
	@FXML
	private TextField prenom;
	@FXML
	private ChoiceBox filiere;
	@FXML
	private ChoiceBox semestre;

	// Event Listener on Button.onAction
	@FXML
	public void ajouter(ActionEvent event) {
		// TODO Autogenerated
		ConnectionMySQL x = new ConnectionMySQL();
		x.AjouterEtud(nom.getText(), prenom.getText(), String.valueOf(filiere.getValue()), String.valueOf(semestre.getValue()));

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		ConnectionMySQL x = new ConnectionMySQL();
		try {
			filiere.getItems().addAll(x.filChoiceBox());
			semestre.getItems().addAll(x.semChoiceBoxAdmin());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


