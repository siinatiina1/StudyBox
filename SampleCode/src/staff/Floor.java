package staff;
/**フロアの定義*/
public class Floor {
	/**名前*/
	private String name;		
	/**笑顔*/
	private int smile;			
	/**明朗さ*/
	private int clarity;		
	/**清潔感*/
	private int cleanliness;	
	/**常識*/
	private int commonSence;	
	/**勤務日数*/
	private int workingDay;		
	
	/**店舗名*/
	public static String shop;
	
	public Floor() {
		
	}	
	public Floor(String nameIn,int smileIn,int clarityIn,int cleanlinessIn,int commonSenceIn,int workingDayIn) {
		this.name=nameIn;
		smile=smileIn;			
		clarity=clarityIn;		
		cleanliness=cleanlinessIn;	
		commonSence=commonSenceIn;	
		workingDay=workingDayIn;	
	}
	
	//setメソッド
	public void setSmile(int smile) {
		if(smile>0) {
			this.smile=smile;
		}else {
			System.out.println("正しい数字に直してください");
		}
	}
	//getメソッド
	public int getSmile(int smile) {
		return this.smile;
	}
	
	//仕事（メソッドで定義）
	
	/**
	 * ・案内の仕事
	 * 人数を言ってもらうためintで引数指定
	 */
	public void guide(int number) {
		//あいさつと自分の名前紹介
		System.out.println("いらっしゃいませ。本日は、"+ this.name+"がご案内します");
		
		//どうゆうふうに仕事をするか
		if(number==1) {
			System.out.println("カウンター席にご案内いたします。");
		}else {
			System.out.println("テーブル席にご案内します。");
		}
	}
}
