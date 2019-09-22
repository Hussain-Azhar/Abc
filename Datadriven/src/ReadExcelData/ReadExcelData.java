package ReadExcelData;

public class ReadExcelData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExcelDataConfig excel=new ExcelDataConfig("c:\\Mukesh\\ExcelData\\TestData.xsls");
		
		System.out.println(excel.getData(0,0,0));

	}

}
