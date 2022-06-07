package personman.view;


import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class LoginScreen extends Application{
	
	private static Stage secondaryStage;

	public static void main(String[] args) throws Exception {
        launch(args);
    }
	
	@Override
    public void start(Stage primaryStage) throws Exception {
		secondaryStage = primaryStage;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/loginScreen.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        secondaryStage.setTitle("Person Management");
        secondaryStage.setScene(scene);
        secondaryStage.setResizable(false);
        secondaryStage.getIcons().add(new Image("C:\\ProjetoMVC\\src\\imgs\\icon.png"));
        secondaryStage.show();
    }
	
	public static void closeScreen() {
		secondaryStage.close();
	}

}
