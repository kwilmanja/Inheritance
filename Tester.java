public class Tester{
	public static void main(String[] args){
//		SavingsAccount bob = new SavingsAccount(1, 0.01);
//		bob.deposit(500.0);
//		bob.withdraw(25.0);
//		bob.print();
//		bob.addInterest();
//		bob.print();


		Bank bank = new Bank("bob");
		bank.openAccount();
		bank.deposit(0, 200);
		bank.openSavingsAccount(0.01);
		bank.deposit(1, 300);
		bank.openCurrentAccount(500);
		bank.deposit(2, 400);
		bank.printAccounts();
		bank.deposit(2, 200);
		bank.update();
		bank.printAccounts();

	}
}