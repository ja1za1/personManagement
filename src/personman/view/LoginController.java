package personman.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private Button botaoLogar;

    @FXML
    private TextField campoSenha;

    @FXML
    private TextField campoUsuario;

    @FXML
    void fazerLogin(ActionEvent event) {
        String usuario = campoUsuario.getText();
        String senha = campoSenha.getText();

        if (usuario.equals("joao lucas") && senha.equals("123456")) {
            System.out.println("Logado com sucesso!!!");
        } else {
            System.out.println("Falha ao realizar login!!!");
        }
    }

}
