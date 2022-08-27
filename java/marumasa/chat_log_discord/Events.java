package marumasa.chat_log_discord;

import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Events {

    @SubscribeEvent
    public void onAttack(ClientChatReceivedEvent event) {
        final String message = event.getMessage().getString()
                .replaceAll("§([0-9a-f]|r|l|o|n|m|k)", "");
        new discord(Config.URL.get(), message).start();
    }
}
