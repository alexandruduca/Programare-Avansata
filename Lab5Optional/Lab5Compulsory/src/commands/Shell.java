package commands;

import catalog.Catalog;
import exceptions.InvalidCommandException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.Year;

import static java.lang.Thread.sleep;

public class Shell {
    public static void execute() throws
            java.io.IOException, InterruptedException {

        Catalog catalog = null;
        String commandLine;
        BufferedReader console = new BufferedReader
                (new InputStreamReader(System.in));

        while (true) {
            System.out.print("Please enter a command: ");
            commandLine = console.readLine();
            System.out.println();
            System.out.println();
            String[] command = commandLine.split(" ");
            try {
                if (!(command[0].equals("add") || command[0].equals("list") || command[0].equals("load") || command[0].equals("play") || command[0].equals("save") || command[0].equals("exit")))
                    throw new InvalidCommandException(command[0]);
                switch (command[0]) {
                    case "add":
                        if (command[1].equals("song"))
                            try {
                                if (command[2] == null || command[3] == null || command[4] == null || command[5] == null)
                                    throw new InvalidCommandException(commandLine);
                                AddCommand.addSong(catalog, command[2], command[3], Year.of(Integer.parseInt(command[4])), command[5]);
                                continue;
                            } catch (InvalidCommandException e) {
                                e.printStackTrace();
                            }
                        if (command[1].equals("image"))
                            try {
                                if (command[2] == null || command[3] == null || command[4] == null)
                                    throw new InvalidCommandException(commandLine);
                                AddCommand.addImage(catalog, command[2], command[3], command[4]);
                                continue;
                            } catch (InvalidCommandException e) {
                                e.printStackTrace();
                            }
                    case "list":
                        ListCommand.list(catalog);
                        System.out.println();
                        continue;
                    case "load":
                        try {
                            if (command[1] == null)
                                throw new InvalidCommandException(commandLine);
                            catalog = LoadCommand.load(command[1]);
                            continue;
                        } catch (InvalidCommandException e) {
                            e.printStackTrace();
                        }
                    case "play":
                        PlayCommand.play(catalog, command[1]);
                        continue;
                    case "save":
                        SaveCommand.save(catalog);
                        continue;
                    case "exit":
                        System.out.println("You have successfully exited the program.");
                        System.exit(0);
                }

            } catch (InvalidCommandException e) {
                e.printStackTrace();
                sleep(100);

            }
        }
    }
}
