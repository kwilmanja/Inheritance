import java.io.*; 
import java.util.*; 
public class Bank{
	ArrayList<Account> accounts;
	private String name;

	public Bank(String name){
		this.name = name;
		accounts = new ArrayList<Account>(0);
	}

	public void openAccount(){
		accounts.add(new Account(accounts.size()));
	}
	public void openSavingsAccount(double interest){
		accounts.add(new SavingsAccount(accounts.size(), interest));
	}
	public void openCurrentAccount(double limit){
		accounts.add(new CurrentAccount(accounts.size(), limit));
	}

	public void deposit(int a, double amount){
		accounts.get(a).deposit(amount);
	}
	public void withdraw(int a, double amount){
		accounts.get(a).withdraw(amount);
	}

	public void update(){
		for(int i = 0; i<accounts.size(); i++){
			accounts.get(i).update();		
		}
	}

	public void printAccounts(){
		for(int i = 0; i<accounts.size(); i++){
			accounts.get(i).print();
		}
	}

}