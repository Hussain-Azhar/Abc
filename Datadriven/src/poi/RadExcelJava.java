package poi;

public class RadExcelJava {
	
	public static void main(String[] args){
		
		File src = new File("c:\\Mukesh\\ExcelData\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XFFSheet sheet1 = wb.getSheetAt(0);
		//String data0 = sheet1.getRow(0).getCell(0).getStringCellvalue();
		//System.out.println("Data from excel is"+data0);
		//String data1=sheet1.getRow(0).getCell(1).getStringCellvalue();
		//SOP("Data from Excel is"+data1);
		
		
		int rowcount=sheet1.getLastRowNum();
		SOP(total rows is "+rowcount+1");
		for(int i=0; i<rowcount; i++){
			
			String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
			SOP("Data from Row"+i+"is "+data0);
		}
		
		
		wb.close();
	}

}
