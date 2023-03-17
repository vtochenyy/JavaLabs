package Lab3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

public class Account {

    private final Collection<Operation> operations;

    public Account() {
        this.operations = new ArrayList<>();
        System.out.println("Account was created!!! \n");
    }

    public Collection<StringBuilder> getOperations(){
        return new ArrayList<>(this.operations.stream()
                .map(x -> new StringBuilder(x.operationType + " / " + x.operationPrice + " / " + x.operationDate))
                .collect(Collectors.toList()));
    }

    public void printOperations(){
        System.out.println("Please, view your info about operations: \n");
        getOperations().forEach(System.out::println);
    }

    public void createOperation(Operation operation){
        this.operations.add(operation);
    }

    static class Operation{
        private final TypeOfOperation operationType;
        private final String operationPrice;
        private final Date operationDate;

        enum TypeOfOperation {
            SNYATIYE,
            PAYMENTS,
            INCOMES
        }


        public Operation(TypeOfOperation operationType, String operationPrice, Date operationDate) {
            this.operationType = operationType;
            this.operationPrice = operationPrice;
            this.operationDate = operationDate;
        }
    }
}
