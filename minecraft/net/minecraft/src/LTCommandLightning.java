package net.minecraft.src;

import java.util.List;

public class LTCommandLightning extends CommandBase {
	
	private LTMod lt = LTMod.getInstance();
	
	@Override
	public String getCommandName() {
		return "lightning";
	}
	
	/**
     * Return the required permission level for this command.
     */
    public int getRequiredPermissionLevel()
    {
        return 2;
    }

	@Override
	public void processCommand(ICommandSender commandSender, String[] args) {
		if (args.length == 1) {
			commandSender.sendChatToPlayer(args[0] + " = " + lt.lightningFire);
        } else if (args.length == 2) {
    		if (args[1].equalsIgnoreCase("true") || args[1].equalsIgnoreCase("false")) {
    			lt.lightningFire = args[1].equalsIgnoreCase("true");
    			notifyAdmins(commandSender, args[0] + " set to " + lt.lightningFire, new Object[0]);
			} else {
				throw new WrongUsageException("/lightning " + args[0] + " [true/false]", new Object[0]);
            }
        } else {
        	throw new WrongUsageException("/lightning " + "setFire" + " [true/false]", new Object[0]);
        }
	}
	
	/**
     * Adds the strings available in this command to the given list of tab completion options.
     */
    public List addTabCompletionOptions(ICommandSender commandSender, String[] commandArray) {
        return commandArray.length == 1 ? getListOfStringsMatchingLastWord(commandArray, new String[] {"setFire"}): (commandArray.length == 2 ? getListOfStringsMatchingLastWord(commandArray, new String[] {"true", "false"}) : null);
    }
}
