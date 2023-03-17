package Lab3;

import java.util.Date;

public class Lab3Main {
    public static void main(String[] args) {

        //Task1
        System.out.println("===============Task1===============");
        Account account = new Account();

        account.createOperation(new Account.Operation(Account.Operation.TypeOfOperation.PAYMENTS, "12$", new Date()));
        account.createOperation(new Account.Operation(Account.Operation.TypeOfOperation.SNYATIYE, "122$", new Date()));
        account.createOperation(new Account.Operation(Account.Operation.TypeOfOperation.PAYMENTS, "12$", new Date()));
        account.createOperation(new Account.Operation(Account.Operation.TypeOfOperation.INCOMES, "192$", new Date()));
        account.createOperation(new Account.Operation(Account.Operation.TypeOfOperation.PAYMENTS, "52$", new Date()));
        account.createOperation(new Account.Operation(Account.Operation.TypeOfOperation.INCOMES, "98$", new Date()));

        account.printOperations();

        //Task2
        System.out.println("===============Task2===============");
        Page page = new Page();
        page.addParagraph(new Paragraph("Text text text"));
        page.addParagraph(new Paragraph("Text text text"));
        page.addParagraph(new Paragraph("Text text text"));
        page.printParagraphs();

    }
}
