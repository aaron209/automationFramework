package seleniumLibrary;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public FileInputStream file;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;

	public ExcelReader(String filePath) throws Exception {
		file = new FileInputStream(filePath);
		workbook = new XSSFWorkbook(file);
	}

	// get cell values of a particular column
	public List<String> getData(String sheetName, String colName) {
		List<String> list = new ArrayList<String>();
		int sheetNum = workbook.getNumberOfSheets();
		for (int i = 0; i < sheetNum; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase(sheetName)) {
				sheet = workbook.getSheetAt(i);
				Iterator<Row> row = sheet.iterator();
				Row firstRow = row.next();
				Iterator<Cell> cell = firstRow.cellIterator();
				int k = 0;
				int colNum = 0;
				while (cell.hasNext()) {
					Cell cellValue = cell.next();
					if (cellValue.getStringCellValue().equals(colName)) {
						colNum = k;
						while (row.hasNext()) {
							Row rows = row.next();
							list.add(rows.getCell(colNum).getStringCellValue());

						}
					}
					k++;
				}

			}
		}
		return list;

	}

	// get all cell values of the file
	public List<String> getCellValue(String sheetName) {
		List<String> list = new ArrayList<String>();
		int numOfSheet = workbook.getNumberOfSheets();
		for (int i = 0; i < numOfSheet; i++) {
			if (workbook.getSheetName(i).equals(sheetName)) {
				sheet = workbook.getSheetAt(i);
				Iterator<Row> row = sheet.iterator();
				while (row.hasNext()) {
					Row firstRow = row.next();
					Iterator<Cell> cell = firstRow.cellIterator();
					while (cell.hasNext()) {
						Cell cellValue = cell.next();
						list.add(cellValue.getStringCellValue());

					}
				}

			}
		}
		return list;
	}

}
