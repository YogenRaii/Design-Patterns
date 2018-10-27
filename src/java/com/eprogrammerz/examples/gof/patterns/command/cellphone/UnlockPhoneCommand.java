package com.eprogrammerz.examples.gof.patterns.command.cellphone;

/**
 * ConcreteCommand - The Command for unlocking the phone
 */
public class UnlockPhoneCommand implements Command {
    private MobilePhone control;

    public UnlockPhoneCommand(MobilePhone control) {
        this.control = control;
    }

    @Override
    public void execute() {
        control.unlockPhone();
    }
}
