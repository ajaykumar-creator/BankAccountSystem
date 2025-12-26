package BankAccountSystem;

public interface BaseContractInterface {

    int getDepositAmount();
    void setDepositAmount(int depositAmount);

    int getWithdrawalAmount();
    void setWithdrawalAmount(int withdrawalAmount);

    int getAccountNumber();
    void setAccountNumber(int accountNumber);

    int getBalance();
    void setBalance(int balance);

    String getName();
    void setName(String name);

    String getAccountType();
    void setAccountType(String accountType);
}
