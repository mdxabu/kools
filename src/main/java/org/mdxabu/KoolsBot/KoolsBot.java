package org.mdxabu.KoolsBot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.mdxabu.Commands.hello;

public class KoolsBot {

    static JDABuilder KoolsBuilder;

    public static void run(){
        KoolsBuilder = JDABuilder.createDefault(System.getenv("BOT-TOKEN"));
        KoolsBuilder.setStatus(OnlineStatus.ONLINE);
        KoolsBuilder.setActivity(Activity.playing("With you :)"));
        KoolsBuilder.enableIntents(GatewayIntent.MESSAGE_CONTENT);

        KoolsBuilder.addEventListeners(new hello());
        KoolsBuilder.build();
    }



}
