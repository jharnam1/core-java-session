package day1;

class BankingApplication {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccountNumber("4561258911");
        bankAccount.setSSN("6521258941");
        bankAccount.setAccountHolderName ("Jharna Mdr");
        bankAccount.setAccountType(AccountType.SAVING_ACCOUNT);
        bankAccount.setAddress("Nepal");
        bankAccount.setRoutingNumber("111010145");
        bankAccount.setPhoneNumber("9452121236");
        bankAccount.setUserName("Jharna");

        String accountNumber = bankAccount.getAccountNumber();
        String hashSSN = bankAccount.getHashedSSN();

    }
}