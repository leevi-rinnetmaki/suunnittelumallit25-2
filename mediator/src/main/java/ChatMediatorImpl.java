import java.util.HashMap;
import java.util.Map;

public class ChatMediatorImpl implements ChatMediator {
    private Map<String, ChatClientController> clients = new HashMap<>();

    @Override
    public void registerClient(ChatClientController client) {
        clients.put(client.getUsername(), client);
    }

    @Override
    public void sendMessage(String sender, String receiver, String message) {
        if (clients.containsKey(receiver)) {
            clients.get(receiver).receiveMessage(sender, message);
            clients.get(sender).receiveMessage("Me (to " + receiver + ")", message);
        }
    }

    @Override
    public String[] getAllUsernames() {
        return clients.keySet().toArray(new String[0]);
    }
}