package personman.view;



import javafx.event.ActionEvent;
import personman.controller.DealWithDataReaded;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField userField;
    
    @FXML
    private Label errorLogin;
   
    @FXML
    void clickLogin(ActionEvent event) throws Exception{
        String user = userField.getText();
        String password = passwordField.getText();
        if(DealWithDataReaded.verifyLogin(user, password)) {
        	LoginScreen.closeScreen();
        	MainScreen.createScene();
        }
        else {
        	errorLogin.setText("Erro ao fazer login!");
        }
        
    }
    
 
}
