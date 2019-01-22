import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a button and place it in the scene
    Button btOK = new Button("OK");
    Scene scene = new Scene(btOK, 225, 250);

    primaryStage.setTitle("MyJavaFX"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
    Stage stage2 = new Stage();
    Button btOK2 = new Button();
    
    Scene scene2 = new Scene(new Button("OK2"), 225, 250);
  
    stage2.setTitle("MyJavaFx2");
    stage2.setScene(scene2);
    
    stage2.show();
    
    btOK2.setText("OK#5");
    
  }
 //Main method only needed for limited JavaFX support IDE’s

  public static void main(String[] args) { 
    launch(args);
  }
}

