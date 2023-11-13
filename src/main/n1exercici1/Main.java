package n1exercici1;

import java.util.Scanner;

public class Main {
    public static void showOptions(){
        System.out.println("Choose your option:\n" +
                "1.- Add new command\n" +
                "2.- Delete last command(undo)\n" +
                "3.- List n last commands\n" +
                "0.- Exit");
    }
    public static void main(String[] args) {
        Undo myUndo = Undo.getInstance();
        Scanner in = new Scanner (System.in);
        int option;
        boolean isExit = false;
        while (!isExit){
            showOptions();
            option = in.nextInt();
            switch (option){
                case 1:
                    System.out.println("Command to add:");
                    String newCommand = in.next();
                    myUndo.addCommand(newCommand);
                    break;
                case 2: myUndo.deleteCommand();
                    break;
                case 3:
                    System.out.println("How many commands do you want to list? Input 0 for all:");
                    int numCommands = in.nextInt();
                    myUndo.listCommands(numCommands);
                    break;
                default:
                    isExit = true;
            }
        }

    }
}
