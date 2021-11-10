package ru.job4j.tracker;

public class StartUI {

    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int selected =  input.askInt("Select: ");
            UserAction action = actions[selected];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        out.println("Menu:");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Output out = new ConsoleOutput();
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateNewItem(out),
                new ShowAllItem(out),
                new ReplaceAction(out),
                new DeleteAction(out),
                new FindByIdAction(out),
                new FindByName(out),
                new ExitAction(out)
        };
        new StartUI(out).init(input, tracker, actions);
    }
}