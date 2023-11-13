package n1exercici1;

public class Main {
    public static void main(String[] args) {
        Undo myUndo = Undo.getInstance();
        for (int i = 1; i < args.length; i++) {
            myUndo.addCommand(args[i]);
        }
    }
}
