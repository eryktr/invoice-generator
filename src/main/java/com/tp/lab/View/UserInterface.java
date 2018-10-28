package com.tp.lab.View;

import com.tp.lab.View.Action.Action;
import com.tp.lab.View.Action.AddClientAction;
import com.tp.lab.View.Action.IllegalChoiceAction;

import java.util.Scanner;

public class UserInterface {
    private Action[] actions;

    public UserInterface() {
        actions = new Action[7];
        actions[1] = new AddClientAction();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("[1] ADD CLIENT");
            System.out.println("[2] REMOVE CLIENT");
            System.out.println("[3] ADD BILL");
            System.out.println("[4] REMOVE BILL");
            System.out.println("[5] SHOW BILLS");
            System.out.println("[6] QUIT");

            int choice = scanner.nextInt();
            if(choice < 1 || choice > 6) {
                Action a = new IllegalChoiceAction();
                a.execute();
            }
            else {
                actions[choice].execute();
            }

        }

    }
}
