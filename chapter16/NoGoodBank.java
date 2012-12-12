public class NoGoodBank {
	private int value = 0;
	private boolean busy = false;
	public void addMoney(int money){
		while (busy){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e){

			}
		}
		busy = true;
		int currentValue = value;
		System.out.println(Thread.currentThread() + "が addMoney に入りました。");
		value += money;
		if (currentValue + money != value){
			System.out.println(Thread.currentThread() + "で矛盾が発生しました！");
			System.exit(-1);
		}
	}
}