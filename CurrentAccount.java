package BankAccountSystem;

public class CurrentAccount extends BaseContract
        implements CurrentAccountInterface {

    private String enableOverdraft;

    public String getEnableOverdraft() {
        return enableOverdraft;
    }

    public void setEnableOverdraft(String message) {
        this.enableOverdraft = message;
    }
}
