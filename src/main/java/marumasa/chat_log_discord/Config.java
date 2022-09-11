package marumasa.chat_log_discord;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<String> URL;

    static {
        BUILDER.push("ChatLogDiscord");

        URL = BUILDER.comment("Discord Webhook URL")
                .define("URL", "Discord Webhook");

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
