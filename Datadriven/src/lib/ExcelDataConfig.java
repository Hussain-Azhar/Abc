package lib;

public class ExcelDataConfig {
	XSSFWorkbook wb;
	
	XSSfSheet sheet1;
	
	public ExcelDataConfig(String excelPath)
	{
		try{
			File src=new File(excelPath);
			FileInputStrem fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
	

}

public String getData(int sheetNumber,int row, int column)
{

	sheet1=wb.getSheetAt(sheetNumber);
	String data= sheet1.getRow(row).getCell(column).getStringCellValue();
	
	return data;
}

public int getRowCount(Int SheetIndex){
	
	int row= wb.getSheetAt(sheetIndex).getLastRowNum();
	row=row+1;
	
	return row;
}


}