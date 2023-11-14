package n1exercici1;


import java.io.*;
import java.util.*;

public class Undo {
    private static Undo instance;
    public List<String> commands;
    private Undo(){
        this.commands = new ArrayList<>();
    }

    public static Undo getInstance(){
        if (instance == null){
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand(String command){
        commands.add (command);
        System.out.println("Command successfully added");
    }

    public void deleteCommand(){
        if (commands.isEmpty()){
            System.out.println("Commands is empty");
        }
        else{
            commands.removeLast();
            System.out.println("Last command successfully deleted");
        }
    }

    public void listCommands(int n){
        if (n == 0){
            n = commands.size() - 1;
        }
        if (commands.isEmpty()){
            System.out.println("No commands saved");
        }
        else if(commands.size() < n){
            System.out.printf("There aren't %d commands saved", n);
            System.out.println();
        }
        else{
            System.out.printf("Printing %d commands starting with last one", n);
            System.out.println();
            for(int i = n - 1; i >= 0; i--){
                System.out.println(commands.get(i));
            }
            System.out.println("Finished printing commands");
        }
    }
}
