package design_patterns.command_pattern.lab.commands;


import design_patterns.command_pattern.lab.service.IAccountService;

/**
 * Created by ${YogenRai} on 4/17/2016.
 */
public class DepositCommand implements Command {
    private IAccountService accountService;
    private long accNo;
    private double depositAmount;

    public DepositCommand(IAccountService accountService, long accNo, double depositAmount) {
        this.accountService = accountService;
        this.accNo = accNo;
        this.depositAmount = depositAmount;
    }

    @Override
    public void execute() {
        accountService.deposit(accNo,depositAmount);
    }

    @Override
    public void undo() {
        accountService.withdraw(accNo,depositAmount);
    }

    @Override
    public void redo() {
        execute();
    }
}
