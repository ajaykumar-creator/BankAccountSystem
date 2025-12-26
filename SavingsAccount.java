package BankAccountSystem;

public class SavingsAccount extends BaseContract
        implements SavingsAccountInterface {

    private String createFixedDeposit;

    public String getCreateFixedDeposit() {
        return createFixedDeposit;
    }

    public void setCreateFixedDeposit(String message) {
        this.createFixedDeposit = message;
    }
}
