package seleniumLibrary;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public FileInputStream input;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;

	public ReadExcel(String filePath) throws Exception {
		input = new FileInputStream(filePath);
		workbook = new XSSFWorkbook(input);
	}

	public List<String> getData(String sheetName, String colName, String rowName) {
		List<String> list = new ArrayList<String>();
		int sheetNum = workbook.getNumberOfSheets();
		for (int i = 0; i < sheetNum; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase(sheetName)) {
				sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				Row firstRow = rows.next();
				Iterator<Cell> cell = firstRow.cellIterator();
				int k = 0;
				int colNum = 0;
				while (cell.hasNext()) {
					Cell cellValue = cell.next();
					if (cellValue.getStringCellValue().equalsIgnoreCase(colName)) {
						colNum = k;
					}
					k++;
				}
				while (rows.hasNext()) {
					Row row = rows.next();
					if (row.getCell(colNum).getStringCellValue().equalsIgnoreCase(rowName)) {
						Iterator<Cell> cellRow = row.iterator();
						while (cellRow.hasNext()) {
							Cell cellsRow = cellRow.next();
							if (cellsRow.getCellType() == CellType.STRING) {
								list.add(cellsRow.getStringCellValue());
							} else {
								list.add(NumberToTextConverter.toText(cellsRow.getNumericCellValue()));
							}
						}
					}
				}
			}
		}
		return list;
	}
}
