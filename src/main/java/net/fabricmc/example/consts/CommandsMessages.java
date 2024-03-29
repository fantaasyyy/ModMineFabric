package net.fabricmc.example.consts;

import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;

public class CommandsMessages {

    public static String COMMAND_SUCCESSFULLY_MESSAGE = "COMMAND EXECUTED SUCCESSFULLY";

    //Key param in TranslatableText reference the json with languages in assets
    public static MutableText COMMAND_BOOK_START = new TranslatableText("item.purple.start_book.message_start").setStyle(Style.EMPTY.withFormatting(Formatting.DARK_PURPLE));
    public static MutableText BOOK_ALREADY_ON_INVENTORY = new TranslatableText("item.purple.start_book.already_have_book").setStyle(Style.EMPTY.withFormatting(Formatting.RED));
    public static MutableText INVENTORY_PLAYER_IS_FULL = new TranslatableText("item.purple.inventory_full").setStyle(Style.EMPTY.withFormatting(Formatting.RED));
    public static MutableText DONT_GIVE_THE_BOOK_QUESTS = new TranslatableText("item.purple.drop_book_quests").setStyle(Style.EMPTY.withFormatting(Formatting.RED));

}