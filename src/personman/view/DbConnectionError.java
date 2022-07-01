package personman.view;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class DbConnectionError extends Application {
	
	private static final String PATHTOFXML = "DbConnectionErrorControler.fxml";

	@Override
	public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(loadFXML());
        configureStage(scene, primaryStage);
	}
	
	private static Parent loadFXML() throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(DbConnectionError.class.getResource(PATHTOFXML));
        Parent root = fxmlLoader.load();
        return root;
	}//Parent loadFXML()
	
	private static void configureStage(Scene scene, Stage primaryStage) {
		primaryStage.setTitle(Screen.DB_CONNECTION_ERROR_TITLE);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image(Screen.PATHTOICON));
        primaryStage.initModality(Modality.WINDOW_MODAL);
        primaryStage.initOwner(LoginScreen.secondaryStage);
        primaryStage.show();
	}//void configureStage()
	
	public static void createScene() throws Exception {
		DbConnectionError dbError = new DbConnectionError();
		Stage primaryStage = new Stage();
		dbError.start(primaryStage);
	}//void CreateScene()
	
}
