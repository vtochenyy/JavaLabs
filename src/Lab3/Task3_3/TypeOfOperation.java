package Lab3.Task3_3;

public enum TypeOfOperation {
    PROCEDURE("Процедура"),
    MEDICAMENT("Лекарство"),
    OPERATION("Операция");

    private final String nameOfOperation;

    public String getNameOfOperation() {
        return nameOfOperation;
    }

    TypeOfOperation(String nameOfOperation) {
        this.nameOfOperation = nameOfOperation;
    }
}
