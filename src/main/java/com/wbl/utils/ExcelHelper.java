package com.wbl.utils;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelHelper {
	private static Logger log = LogManager.getLogger(ExcelHelper.class);
 
	public static Object[][] getExcelData(String fileName,String sheetname){
		Object[][] data = null;
		XSSFWorkbook wb = null;
//		System.out.println(Constants.Resources_path+"/test-data/"+fileName);
		try {
			wb = new XSSFWorkbook(Constants.Resources_path+"/test-data/"+fileName);

			XSSFSheet sheet = wb.getSheet(sheetname);
			int rowsIndex = sheet.getLastRowNum();//return last row index,index starts from 0
			log.info("total rows:"+rowsIndex);
			data =new Object[rowsIndex][];
			
			for(int i=1;i<= rowsIndex;i++) {
				XSSFRow row = sheet.getRow(i);
				int cols = row.getLastCellNum();//returns no.of columns,index start from 0
				log.info("total cols:"+cols);
				Object[] colData = new Object[cols];
				for(int j=0;j<cols;j++) {
					colData[j] = row.getCell(j).toString();
				}
				data[i-1]=colData;
			}
		}catch(IOException e) {
				log.error("ExcelHelper exception:"+e);
			}finally {
				try {
					wb.close();
				}catch (IOException e) {
					log.error(e);
				
				}
			}
			return data;
			
				
			}
}
		
	


