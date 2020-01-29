public class CurrentAccount extends Account{
	private double limit;

	public CurrentAccount(int a, double limit){
		super(a);
		this.limit = limit;
	}

	public void reportOverDraft(){
		if (this.getBalance() > limit){
			System.out.println("Error! Account over limit by " + (this.getBalance() - limit));
		}
	}
	public void update(){
		reportOverDraft();
	}

}