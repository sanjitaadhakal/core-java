package oopconcept;

public class BankAccount{
    private String accountHolderName;
    private String accountNumber;
    private AccountType accountType;
    private double accountBalance;
    private String routingNumber;
    private String socialSecurityNumber;
    private String accountHolderAddress;
    private String accountHolderDOB;
    private String accountHolderGender;
    private String  accountHolderPhoneNumber;
    private String accountHolderEmail;
    private boolean isMinorAccount;
    private final String BANK_NAME = "Chase Bank";

    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount();
        newAccount.accountType = AccountType.CHECKING;

        BankAccount oldAccount = new BankAccount();
        oldAccount.accountType = AccountType.SAVINGS;


    }
}
