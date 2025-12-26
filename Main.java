package BankAccountSystem;

public class Main {

    public static void main(String[] args) {

       User user1 = new User();
        User user2 = new User();

        SavingsAccountInterface savingsAccount = new SavingsAccount();
        CurrentAccountInterface currentAccount = new CurrentAccount();

        // USER 1 - SAVINGS
        user1.setName("USER 1");
        user1.setAccountType("SAVINGS");
        user1.setBalance(0);
        user1.setDepositAmount(10000);

        // USER 2 - CURRENT
        user2.setName("USER 2");
        user2.setAccountType("CURRENT");
        user2.setBalance(0);
        user2.setDepositAmount(50000);

        savingsAccount.setCreateFixedDeposit("Fixed Deposit Created");
        currentAccount.setEnableOverdraft("Overdraft Enabled");

        savingsAccount.setName(user1.getName());
        savingsAccount.setBalance(user1.getBalance());

        currentAccount.setName(user2.getName());
        currentAccount.setBalance(user2.getBalance());

        if (user1.getAccountType()==("SAVINGS")) {
            System.out.println(user1.getName() + "- SAVINGS");
            System.out.println("Deposited- " + user1.getDepositAmount());
            System.out.println("Balance- " + savingsAccount.getBalance());
            System.out.println(savingsAccount.getCreateFixedDeposit());
        }

        System.out.println();

        if (user2.getAccountType()==("CURRENT")) {
            System.out.println(user2.getName() + "- CURRENT");
            System.out.println("Deposited- " + user2.getDepositAmount());
            System.out.println("Balance- " + currentAccount.getBalance());
            System.out.println(currentAccount.getEnableOverdraft());
        }
    }
}

