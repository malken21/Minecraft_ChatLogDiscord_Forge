package marumasa.chat_log_discord;

public class discord extends Thread {

    //----------Thread----------//

    private final String url;
    private final String json;

    public discord(String URL, String text) {
        url = URL;
        json = "{\"content\":\"" + text + "\"}";
    }

    public void run() {
        request.post(url, json);
    }
}
