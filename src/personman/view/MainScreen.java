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
		primaryStage = secondaryStage;
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainScreen.fxml"));
        Parent root = fxmlLoader.load();
        Scene tela = new Scene(root);
        secondaryStage.setTitle("Person Management");
        secondaryStage.setScene(tela);
        secondaryStage.show();
        secondaryStage.setResizable(false);
        secondaryStage.getIcons().add(new Image("C:\\ProjetoMVC\\src\\imgs\\icon.jpg"));
	}
}
