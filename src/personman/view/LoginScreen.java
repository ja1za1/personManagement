package personman.view;


import java.io.IOException;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class LoginScreen extends Application{
	
<<<<<<< HEAD
	public static Stage secondaryStage;
	
	private final static String PATHTOFXML = "/fxml/loginScreen.fxml";
	
=======
	private static Stage secondaryStage;
	
	private final static String PATHTOFXML = "/fxml/loginScreen.fxml";
	
	public final static String  TITLE = "Person Management",
								PATHTOICON = "C:\\ProjetoMVC\\src\\imgs\\icon.png";

>>>>>>> 0ecdab9b45cd177b6c9d95523072ae6c389f9510
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
<<<<<<< HEAD
		secondaryStage.setTitle(Screen.TITLE);
        secondaryStage.setScene(scene);
        secondaryStage.setResizable(false);
        secondaryStage.getIcons().add(new Image(Screen.PATHTOICON));
=======
		secondaryStage.setTitle(TITLE);
        secondaryStage.setScene(scene);
        secondaryStage.setResizable(false);
        secondaryStage.getIcons().add(new Image(PATHTOICON));
>>>>>>> 0ecdab9b45cd177b6c9d95523072ae6c389f9510
        secondaryStage.show();
	}//void configureStage()
	
	public static void closeScreen() {
		secondaryStage.close();
	}//void closeScreen()

}//class LoginScreen
