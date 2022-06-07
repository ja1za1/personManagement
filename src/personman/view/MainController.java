package personman.view;

import java.time.LocalDate;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class MainController {
	
	 @FXML
	 private TabPane tabpane;
	 
	 @FXML
	 private Tab cadTab;
	 
	 //start of cadTab
	 
	 @FXML
	 private Pane pane;
	 
	 @FXML
	 private TextField nameField;
	
	 @FXML
	 private DatePicker birthdayField;
	 
	 @FXML
	 private TextField emailField;
	 
	 @FXML
	 private TextField telephoneField;
	 
	 @FXML
	 private TextField cpfField;

	 @FXML
	 private TextField cityField;
	 
	 @FXML
	 private Button cadButton;
	 
	 @FXML
	 void clickedCadButton(ActionEvent event) {
		 String name = nameField.getText();
		 LocalDate bday = birthdayField.getValue();
		 String email = emailField.getText();
		 String telephone = telephoneField.getText();
		 String cpf = cpfField.getText();
		 String city = cityField.getText();
		 
		 
		 System.out.println(bday.toString() + name + email + telephone + cpf + city);
	 }
	 
	 //finish of cadTab
	 
	 @FXML
	 private Tab listTab;
	 


    
}
