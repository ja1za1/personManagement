package personman.view;



import javafx.event.ActionEvent;
<<<<<<< HEAD
=======

>>>>>>> 0ecdab9b45cd177b6c9d95523072ae6c389f9510
import personman.controller.DealWithDataReaded;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
	
	private final static String LOGINERROR = "Erro ao fazer login!";

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
<<<<<<< HEAD
        final int loginResult = DealWithDataReaded.verifyLogin(user, password);
        if(loginResult == DealWithDataReaded.SUCCESS) {
        	LoginScreen.closeScreen();
        	MainScreen.createScene();
        }
        else if(loginResult == DealWithDataReaded.INCONSISTENT_DATA) {
        	errorLogin.setText(LOGINERROR);
        }
        else{
        	DbConnectionError.createScene();
        }
=======
        if(DealWithDataReaded.verifyLogin(user, password)) {
        	LoginScreen.closeScreen();
        	MainScreen.createScene();
        }
        else {
        	errorLogin.setText(LOGINERROR);
        }
>>>>>>> 0ecdab9b45cd177b6c9d95523072ae6c389f9510
        
    }//void clickLogin()
    
    
 
}//class LoginController
