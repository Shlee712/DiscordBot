package DiscordBotAlpha.DBAlpha;

import sx.blah.discord.api.IDiscordClient;

public class MainRunner {

	public static void main(String[] args) {

        if(args.length != 1){
            System.out.println("Please enter the bots token as the first argument e.g java -jar thisjar.jar tokenhere");
            return;
        }
		
        IDiscordClient cli = BotUtils.getBuiltDiscordClient(args[0]);
        System.out.println("Bot is logging in with token "+args[0]);
        
        cli.getDispatcher().registerListener(new CommandHandler());
        System.out.println("Bot is now attempting to listen for messages");
        
        cli.login();
        System.out.println("Successfully logged in");
	}

}
