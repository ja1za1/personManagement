package personman.view;

<<<<<<< HEAD
import java.net.URL;


import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
=======
import java.time.LocalDate;
>>>>>>> 0ecdab9b45cd177b6c9d95523072ae6c389f9510
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
<<<<<<< HEAD
import javafx.scene.control.Label;
=======
>>>>>>> 0ecdab9b45cd177b6c9d95523072ae6c389f9510
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import personman.controller.DealWithDataReaded;

<<<<<<< HEAD
public class MainController implements Initializable{
=======
public class MainController {
>>>>>>> 0ecdab9b45cd177b6c9d95523072ae6c389f9510
	
	 @FXML
	 private TabPane tabpane;
	 
	 @FXML
	 private Tab cadTab;
	 
	 //start of cadTab
	 
	 @FXML
	 private Pane pane;
	 
	 @FXML
	 private TextField nameField;
<<<<<<< HEAD
	 
	 @FXML
	 private Label errorName;
=======
>>>>>>> 0ecdab9b45cd177b6c9d95523072ae6c389f9510
	
	 @FXML
	 private DatePicker birthdayField;
	 
	 @FXML
	 private TextField emailField;
	 
	 @FXML
<<<<<<< HEAD
	 private Label errorEmail;
	 
	 @FXML
=======
>>>>>>> 0ecdab9b45cd177b6c9d95523072ae6c389f9510
	 private TextField telephoneField;
	 
	 @FXML
	 private TextField cpfField;

	 @FXML
	 private TextField cityField;
	 
	 @FXML
	 private Button cadButton;
	 
<<<<<<< HEAD
	 private final static String INVALIDEMAIL = "Email inválido",
			 					 INVALIDNAME = "Nome inválido";
	 
	 @Override
	 public void initialize(URL location, ResourceBundle resources) {
		addEmailFieldEventListener(emailField, errorEmail);
		addNameFieldEventListener(nameField, errorName);
		
		
		birthdayField.valueProperty().addListener((obs, oldDate, newDate)->{
			
		});
	 }
	 
	 private static void addEmailFieldEventListener(TextField emailField, Label errorEmail) {
		 emailField.textProperty().addListener((obs, oldText, newText) ->{
				if(!newText.contains("@") || !newText.contains(".com")) {
					errorEmail.setText(INVALIDEMAIL);
				}
				else {
					errorEmail.setText(null);
				}
		 });
	 }
	 
	 private static void addNameFieldEventListener(TextField nameField, Label errorName) {
		 nameField.textProperty().addListener((obs, oldText, newText) ->{
			 if(newText.length() < 3 || newText.endsWith(" ") || newText.startsWith(" ")) {
				 errorName.setText(INVALIDNAME);
			 }
			 else if(newText.contains(" ")) {
				 String doubleBarrelledName[] = newText.split(" ");
				 if(doubleBarrelledName[0].length() <= 1 || doubleBarrelledName[1].length() <= 1) {
					 errorName.setText(INVALIDNAME);
				 }
				 else {
					 errorName.setText(null);
				 }
			 }
			 else {
				 errorName.setText(null);
			 }
		 });
	 }
	 
=======
>>>>>>> 0ecdab9b45cd177b6c9d95523072ae6c389f9510
	 @FXML
	 void clickedCadButton(ActionEvent event) {
		String[] userData = {nameField.getText(), emailField.getText(), telephoneField.getText(), 
				 			  cpfField.getText(), cityField.getText()};
		LocalDate bday = birthdayField.getValue();
		
		if(DealWithDataReaded.verifyRegistration(userData,bday) == false) {
			System.out.println("Erro no cadastro");
		}
		else {
			System.out.println("Dados preenchidos");
		}
		 
		 
	 }
	 
	 //finish of cadTab
	 
	 @FXML
	 private Tab listTab;
	 


    
}
