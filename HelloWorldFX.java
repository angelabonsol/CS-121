import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class HelloWorldFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primarystage) {
        primarystage.setTitle("Wanna know who your future boyfriend is?");
        Button btn = new Button();
        btn.setText("Click to reveal his name");
        
        btn.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent eve)
            {
                System.out.println("Error: Sorry that boy doesn't exist."); 
                
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primarystage.setScene(new Scene(root, 400, 250));
        primarystage.show();
    }
}
