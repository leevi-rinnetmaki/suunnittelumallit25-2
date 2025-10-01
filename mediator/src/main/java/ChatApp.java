import javafx.application.Application;
import javafx.stage.Stage;

public class ChatApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        ChatMediator mediator = new ChatMediatorImpl();

        new ChatClientController("Vesa Ollikainen", mediator);
        new ChatClientController("Amir Dirin", mediator);
        new ChatClientController("Jorma Räty", mediator);
    }

    public static void main(String[] args) {
        launch(args);
    }
}