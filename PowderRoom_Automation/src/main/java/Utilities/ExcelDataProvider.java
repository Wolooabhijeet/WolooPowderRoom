package Utilities;

import org.testng.annotations.DataProvider;

public class ExcelDataProvider {
	@DataProvider(name = "excelData")
    public static Object[][] provideExcelData() {
        String filePath = "./src/test/resources/categoryData.xlsx";
        String sheetName = "Categories";
        return ExcelUtility.readExcelAsDataProvider(filePath, sheetName);
    }

}
