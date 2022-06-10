package personman.view;


import java.io.IOException;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class LoginScreen extends Application{
	
	private static Stage secondaryStage;
	
	private final static String PATHTOFXML = "/fxml/loginScreen.fxml";
	
	public final static String  TITLE = "Person Management",
								PATHTOICON = "C:\\ProjetoMVC\\src\\imgs\\icon.png";

	public static void main(String[] args) throws Exception {
        launch(args);
    }
	
	@Override
    public void start(Stage primaryStage) throws Exception {
		secondaryStage = primaryStage;
        Scene scene = new Scene(loadFXML());
        configureStage(scene);
    }//void start()
	
	private static Parent loadFXML() throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(LoginScreen.class.getResource(PATHTOFXML));
        Parent root = fxmlLoader.load();
        return root;
	}//Parent loadFXML()
	
	private static void configureStage(Scene scene) {
		secondaryStage.setTitle(TITLE);
        secondaryStage.setScene(scene);
        secondaryStage.setResizable(false);
        secondaryStage.getIcons().add(new Image(PATHTOICON));
        secondaryStage.show();
	}//void configureStage()
	
	public static void closeScreen() {
		secondaryStage.close();
	}//void closeScreen()

}//class LoginScreen
