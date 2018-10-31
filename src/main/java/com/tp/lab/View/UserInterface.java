package com.tp.lab.View;

import com.tp.lab.View.Action.*;

import java.util.Scanner;

public final class UserInterface {
    private Action[] actions;

    public UserInterface() {
        actions = new Action[10];
        actions[0] = new QuitAction();
        actions[1] = new AddClientAction();
        actions[2] = new DeleteClientAction();
        actions[3] = new ShowClientsAction();
        //actions[4] = new AddBillAction();
        //actions[5] = new DeleteBillAction();
        //actions[6] = new ShowBillsAction();
        actions[7] = new AddProductAction();
        actions[8] = new DeleteProductAction();
        actions[9] = new ShowProductsAction();

    }

    public void start() {

        while(true) {
            System.out.println("[1] ADD CLIENT");
            System.out.println("[2] REMOVE CLIENT");
            System.out.println("[3] SHOW CLIENTS");
            System.out.println("[4] ADD BILL");
            System.out.println("[5] REMOVE BILL");
            System.out.println("[6] SHOW BILLS");
            System.out.println("[7] ADD PRODUCT");
            System.out.println("[8] REMOVE PRODUCT");
            System.out.println("[9] SHOW PRODUCTS");
            System.out.println("[0] QUIT");
            System.out.println("Choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if(choice < 0|| choice > 9) {
                Action a = new IllegalChoiceAction();
                a.execute();
            }
            else {
                actions[choice].execute();
            }

        }

    }
}
