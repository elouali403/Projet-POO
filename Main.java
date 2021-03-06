package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;


public class Main extends Application {
	public static Stage stg;
	public static Scene scn;
	@Override
	public void start(Stage primaryStage) {
		try {
			stg=primaryStage;
		    Parent root = FXMLLoader.load(getClass().getResource("/Interface/Login.fxml"));
            Scene scene = new Scene (root);
            scn=scene;
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("Groupe INSA");
			primaryStage.getIcons().add(new Image("C:\\Users\\hp\\Desktop\\image java\\Luxury Real Estate Logo2.png"));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void changeScene(String fxml) throws IOException {
		   Parent pane= FXMLLoader.load(getClass().getResource(fxml));
		   if ( fxml!= "/Interface/Login.fxml")
		   {
			   stg.getScene().setRoot (pane);
			   stg.setResizable(false);
			   stg.setWidth(1079);
			   stg.setHeight(661);
			   stg.centerOnScreen();
		   }
		   else {
			   stg.getScene().setRoot (pane);
			   stg.setFullScreen(false);
			   stg.setResizable(false);
			   stg.setWidth(620);
			   stg.setHeight(392);
			   stg.centerOnScreen();
		   }
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}


