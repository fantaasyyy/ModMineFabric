package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.example.ITEMS.FOLDER_START_BOOK.ScreenBook;
import net.fabricmc.example.ITEMS.FOLDER_START_BOOK.StartBook;
import net.fabricmc.example.commands.Commands;
import net.fabricmc.example.factory.commands.FactoryCommands;
import net.fabricmc.example.factory.commands.FactoryCommandsImpl;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.fabricmc.example.ITEMS.FOLDER_PURPLE_APPLE.PurpleApple.PURPLE_APPLE;
import static net.fabricmc.example.ITEMS.FOLDER_PURPLE_APPLE.PurpleApple.PURPLE_APPLE_ID;
import static net.fabricmc.example.ITEMS.FOLDER_START_BOOK.StartBook.*;

public class ExampleMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("modid");


	@Override
	public void onInitialize() {

		FactoryCommands factoryCommands = new FactoryCommandsImpl();
		Commands commands = new Commands();
		factoryCommands.createCommandWithFunctionArgument("start", commands, commands.giveBookQuests());
		//Registrando o item
		BuiltinRegistries.add(Registry.ITEM, PURPLE_APPLE_ID, PURPLE_APPLE);
		BuiltinRegistries.add(Registry.ITEM,ID_START_BOOK,START_BOOK);
		ScreenHandlerRegistry.registerSimple(Registry.SCREEN_HANDLER.getId(SCREEN_BOOK_SCREEN_HANDLER), );

		// menssagem ao entrar no jogo
		LOGGER.info("Hi, my name is Ego and i`am the creator of this mod, i hope that u have fun 😘 !");
	}
}