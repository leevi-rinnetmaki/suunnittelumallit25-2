import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChatClientController {
    private String username;
    private ChatMediator mediator;

    private TextArea chatArea;
    private TextField messageField;
    private ComboBox<String> recipientBox;

    public ChatClientController(String username, ChatMediator mediator) {
        this.username = username;
        this.mediator = mediator;
        mediator.registerClient(this);
        initUI();
    }

    public String getUsername() {
        return username;
    }

    private void initUI() {
        Stage stage = new Stage();
        stage.setTitle("Chat - " + username);

        chatArea = new TextArea();
        chatArea.setEditable(false);

        messageField = new TextField();
        messageField.setPromptText("Enter message...");

        recipientBox = new ComboBox<>();
        recipientBox.getItems().addAll(mediator.getAllUsernames());
        recipientBox.setPromptText("Select recipient");

        Button sendButton = new Button("Send");
        sendButton.setOnAction(e -> {
            String recipient = recipientBox.getValue();
            String msg = messageField.getText();
            if (recipient != null && !msg.isEmpty()) {
                mediator.sendMessage(username, recipient, msg);
                messageField.clear();
            }
        });

        VBox root = new VBox(10, chatArea, recipientBox, messageField, sendButton);
        root.setStyle("-fx-padding: 10;");
        stage.setScene(new Scene(root, 400, 300));
        stage.show();
    }

    public void receiveMessage(String sender, String message) {
        chatArea.appendText(sender + ": " + message + "\n");
    }
}