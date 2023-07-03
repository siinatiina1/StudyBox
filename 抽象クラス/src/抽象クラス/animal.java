package 抽象クラス;

public abstract class animal {
	public void bless() {
		System.out.println("酸素美味しい");
		System.out.println("CO2を吐き出す");
	}
	public void walk() {
		System.out.println("足を使って前に進む");
	}
	public abstract void cry();
}
