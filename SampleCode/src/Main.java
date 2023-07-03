import staff.Floor;

public class Main {
	public static void main(String[] args) {
		System.out.println();
		//Floorをインスタンス生成する
		Floor staff1= new Floor("tarou",4,4,4,4,4);
		/*
		staff1.name	="スズキ";
		staff1.smile=5;
		staff1.clarity=3;
		staff1.cleanliness=5;
		staff1.commonSence=3;
		staff1.workingDay=5;
		*/
		// 案内メソッドを呼び出す
		staff1.guide(staff1.clarity);
		
		
	}
}
