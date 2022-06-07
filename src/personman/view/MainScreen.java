package personman.view;


import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainScreen extends Application{
	
	private static Stage secondaryStage;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		secondaryStage = primaryStage;
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/mainScreen.fxml"));
        Parent root = fxmlLoader.load();
        Scene tela = new Scene(root);
        secondaryStage.setTitle("Person Management");
        secondaryStage.setScene(tela);
        secondaryStage.getIcons().add(new Image("C:\\ProjetoMVC\\src\\imgs\\icon.png"));
        secondaryStage.setResizable(false);
        secondaryStage.show();
        
	}
	
	public static void createScene() throws Exception {
		MainScreen mainScreen = new MainScreen();
		Stage primaryStage = new Stage();
		mainScreen.start(primaryStage);
	}
}
