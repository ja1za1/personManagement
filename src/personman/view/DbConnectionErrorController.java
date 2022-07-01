package personman.view;

import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class DbConnectionErrorController {

    @FXML
    private Button okButton;
 
    @FXML
    void CloseScreen(ActionEvent event) {
    	Stage currentStage = (Stage)okButton.getScene().getWindow();
    	currentStage.close();
    }

}



