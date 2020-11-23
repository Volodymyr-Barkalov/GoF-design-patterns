package com.barkalov.behavioral.command;

public class CommandRunner {
    public static void main(String[] args) {
        Database database = new Database();

        Programmer proger = new Programmer(
                new InsertCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database)
        );

        proger.insertRecord();
        proger.updateRecord();
        proger.selectRecord();
        proger.deleteRecord();
    }
}
