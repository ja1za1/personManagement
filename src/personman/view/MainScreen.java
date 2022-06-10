package personman.view;


import java.io.IOException;

import javafx.application.Application;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainScreen extends Application{
	
	private static final String PATHTOFXML = "/fxml/mainScreen.fxml";
					
	@Override
	public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(loadFXML());
        configureStage(primaryStage, scene);
	}//void start()
	
	public static void createScene() throws Exception {
		MainScreen mainScreen = new MainScreen();
		Stage primaryStage = new Stage();
		mainScreen.start(primaryStage);
	}//void createScene()
	
	private static Parent loadFXML() throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(MainScreen.class.getResource(PATHTOFXML));
        Parent root = fxmlLoader.load();
        return root;
	}//Parent loadFXML()
	
	private static void configureStage(Stage primaryStage, Scene scene) {
		primaryStage.setTitle(LoginScreen.TITLE);
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image(LoginScreen.PATHTOICON));
        primaryStage.setResizable(false);
        primaryStage.show();
	}//void configureStage()
	
}//class MainScreen
