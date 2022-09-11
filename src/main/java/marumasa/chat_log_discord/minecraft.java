package marumasa.chat_log_discord;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod(minecraft.MODID)
public class minecraft {

    public static final String MODID = "chat_log_discord";

    public minecraft() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.SPEC, "ChatLogDiscord.toml");
        MinecraftForge.EVENT_BUS.register((new Events()));
    }
}
