package personman.view;



import javafx.event.ActionEvent;

import personman.controller.DealWithDataReaded;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
//import javafx.stage.Stage;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private Button botaoLogar;

    @FXML
    private PasswordField campoSenha;

    @FXML
    private TextField campoUsuario;
    
    @FXML
    private Label errorLogin;


    @FXML
    void fazerLogin(ActionEvent event) throws Exception{
        String usuario = campoUsuario.getText();
        String senha = campoSenha.getText();
        if(DealWithDataReaded.verifyLogin(usuario, senha)) {
        	LoginScreen.closeScreen();
        	MainScreen mainScreen = new MainScreen();
        	Stage primaryStage = new Stage();
        	mainScreen.start(primaryStage);
        }
        else {
        	errorLogin.setText("Erro ao fazer login!!!");
        }
        
    }
    
  


}
