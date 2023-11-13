package n1exercici1;


import java.util.ArrayList;

public class Undo {
    private static Undo instance;
    public ArrayList<String> commands;
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
        commands.add (0,command);
        System.out.println("Command successfully added");
    }

    public void deleteCommand(String command){
        if (!commands.contains(command)){
            System.out.println("Command not found");
        }
        else{
            commands.remove(command);
            System.out.println("Command successfully deleted");
        }
    }

    public void listCommands(){
        if (commands.isEmpty()){
            System.out.println("No commands saved");
        }
        else{
            System.out.println("Printing commands starting with last one");
            for(String command : commands){
                System.out.println(command);
            }
            System.out.println("Finished printing commands");
        }
    }
}
