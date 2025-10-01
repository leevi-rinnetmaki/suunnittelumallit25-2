public interface ChatMediator {
    void registerClient(ChatClientController client);
    void sendMessage(String sender, String receiver, String message);
    String[] getAllUsernames();
}