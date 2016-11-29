package Methods;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Viral on 11/26/2016.
 */
public class ExcelFileConfig {

    /**
     * Read Entered Sheet All Data.
     * @param FilePath
     * @param SheetNo
     * @return Return Sheet All Data In String Array.
     */
    public static ArrayList<String> readExcelSheetAllData(String FilePath, int SheetNo) {

        ArrayList<String> SheetData = new ArrayList<String>();
        try {
            FileInputStream inputStream = new FileInputStream(new File(FilePath));

            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet firstSheet = workbook.getSheetAt(SheetNo);
            Iterator<Row> iterator = firstSheet.iterator();

            while (iterator.hasNext()) {
                Row nextRow = iterator.next();
                Iterator<Cell> cellIterator = nextRow.cellIterator();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();

                    DataFormatter formatter = new DataFormatter();

                    String CellData = formatter.formatCellValue(cell);

                    SheetData.add(CellData);
                }
            }
            inputStream.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return SheetData;
    }

    /**
     * Read Only Enter Row Data.
     * @param FilePath
     * @param SheetNo
     * @param RowNo
     * @return Return Selected Row Data In String Array.
     */
    public static ArrayList<String> readSelectedRow(String FilePath, int SheetNo, int RowNo) {

        ArrayList<String> SheetData = new ArrayList<String>();
        try {
            FileInputStream inputStream = new FileInputStream(new File(FilePath));

            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet firstSheet = workbook.getSheetAt(SheetNo);
            Iterator<Row> iterator = firstSheet.iterator();


            while (iterator.hasNext()) {
                Row nextRow = iterator.next();
                if (nextRow.getRowNum() == RowNo) {

                    Iterator<Cell> cellIterator = nextRow.cellIterator();

                    while (cellIterator.hasNext()) {
                        Cell cell = cellIterator.next();

                        DataFormatter formatter = new DataFormatter();

                        String CellData = formatter.formatCellValue(cell);

                        SheetData.add(CellData);
                    }
                }

            }
            inputStream.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return SheetData;
    }

    /**
     * Read Only Enter Column Data.
     * @param FilePath
     * @param SheetNo
     * @param ColumnNo
     * @return Return Selected Column Data In String Array.
     */
    public static ArrayList<String> readselectColumn(String FilePath, int SheetNo, int ColumnNo) {

        ArrayList<String> SheetData = new ArrayList<String>();
        try {
            FileInputStream inputStream = new FileInputStream(new File(FilePath));

            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet firstSheet = workbook.getSheetAt(SheetNo);
            Iterator<Row> iterator = firstSheet.iterator();

            while (iterator.hasNext()) {
                Row nextRow = iterator.next();
                Iterator<Cell> cellIterator = nextRow.cellIterator();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();

                    if (cell.getColumnIndex() == ColumnNo) {
                        DataFormatter formatter = new DataFormatter();

                        String CellData = formatter.formatCellValue(cell);

                        SheetData.add(CellData);
                    }
                }
            }
            inputStream.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return SheetData;
    }

    /**
     * Read Only Single Cell.
     * @param FilePath
     * @param SheetNo
     * @param RowNo
     * @param ColumnNo
     * @return Selected Cell Value In String.
     */
    public static String readSelectedCell(String FilePath, int SheetNo, int RowNo, int ColumnNo) {

        String CellValue = null;
        try {
            FileInputStream inputStream = new FileInputStream(new File(FilePath));

            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet firstSheet = workbook.getSheetAt(SheetNo);
            Iterator<Row> iterator = firstSheet.iterator();

            while (iterator.hasNext()) {
                Row nextRow = iterator.next();

                if (nextRow.getRowNum() == RowNo) {
                    Iterator<Cell> cellIterator = nextRow.cellIterator();

                    while (cellIterator.hasNext()) {
                        Cell cell = cellIterator.next();

                        if (cell.getColumnIndex() == ColumnNo) {
                            DataFormatter formatter = new DataFormatter();

                            CellValue = formatter.formatCellValue(cell);

                        }
                    }
                }
            }
            inputStream.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return CellValue;
    }

    /**
     * Write String Data On Selected Cell.
     *
     * @param FilePath
     * @param SheetNumber
     * @param Row
     * @param Cell
     * @param Text
     */
    public static void writeStringDataOnCell(String FilePath, int SheetNumber, int Row, int Cell, String Text) {
        try {
            FileInputStream file = new FileInputStream(new File(FilePath).getAbsolutePath());

            // Get the workbook instance for XLS file
            HSSFWorkbook workbook = new HSSFWorkbook(file);

            // Get first sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(SheetNumber);

            Cell cell = null;

            cell = sheet.getRow(Row).createCell(Cell);

            cell.setCellValue((String) Text);

            file.close();

            FileOutputStream outFile = new FileOutputStream(new File(FilePath));
            workbook.write(outFile);
            outFile.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Write Integer Data On Selected Cell.
     *
     * @param FilePath
     * @param SheetNumber
     * @param Row
     * @param Cell
     * @param Number
     */
    public static void writeIntDataOnCell(String FilePath, int SheetNumber, int Row, int Cell, int Number) {
        try {
            FileInputStream file = new FileInputStream(new File(FilePath).getAbsolutePath());

            // Get the workbook instance for XLS file
            HSSFWorkbook workbook = new HSSFWorkbook(file);

            // Get first sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(SheetNumber);

            Cell cell = null;

            cell = sheet.getRow(Row).createCell(Cell);

            cell.setCellValue((int) Number);

            file.close();

            FileOutputStream outFile = new FileOutputStream(new File(FilePath));
            workbook.write(outFile);
            outFile.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Write Float Data On Selected Cell.
     *
     * @param FilePath
     * @param SheetNumber
     * @param Row
     * @param Cell
     * @param FloatNumber
     */
    public static void writeIntDataOnCell(String FilePath, int SheetNumber, int Row, int Cell, float FloatNumber) {
        try {
            FileInputStream file = new FileInputStream(new File(FilePath).getAbsolutePath());

            // Get the workbook instance for XLS file
            HSSFWorkbook workbook = new HSSFWorkbook(file);

            // Get first sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(SheetNumber);

            Cell cell = null;

            cell = sheet.getRow(Row).createCell(Cell);

            cell.setCellValue((float) FloatNumber);

            file.close();

            FileOutputStream outFile = new FileOutputStream(new File(FilePath));
            workbook.write(outFile);
            outFile.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Write Boolean Data On Selected Cell.
     *
     * @param FilePath
     * @param SheetNumber
     * @param Row
     * @param Cell
     * @param BooleanValue
     */
    public static void writeIntDataOnCell(String FilePath, int SheetNumber, int Row, int Cell, Boolean BooleanValue) {
        try {
            FileInputStream file = new FileInputStream(new File(FilePath).getAbsolutePath());

            // Get the workbook instance for XLS file
            HSSFWorkbook workbook = new HSSFWorkbook(file);

            // Get first sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(SheetNumber);

            Cell cell = null;

            cell = sheet.getRow(Row).createCell(Cell);

            cell.setCellValue((Boolean) BooleanValue);

            file.close();

            FileOutputStream outFile = new FileOutputStream(new File(FilePath));
            workbook.write(outFile);
            outFile.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Write String Data On Multiple Cell.
     * Enter Stating Row Number For Start Writing On That Row.
     * Enter Stating and Ending Cell Number.
     *
     * @param FileName
     * @param SheetNumber
     * @param StartRow
     * @param StartCell
     * @param EndCell
     * @param Text
     */
    public static void writeStringDataOnMultipalCell(String FileName, int SheetNumber, int StartRow, int StartCell, int EndCell, String Text) {
        try {

            FileInputStream file = new FileInputStream(new File(FileName).getAbsolutePath());

            HSSFWorkbook workbook = new HSSFWorkbook(file);

            HSSFSheet sheet = workbook.getSheetAt(SheetNumber);

            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()) {

                Row row = rowIterator.next();
                if (row.getRowNum() >= StartRow) {

                    int row1 = row.getRowNum();

                    Cell cell = null;

                    for (int i = StartCell; i <= EndCell; i++) {
                        cell = sheet.getRow(row1).createCell(i);

                        cell.setCellValue((String) Text);

                    }
                }

            }
            file.close();

            FileOutputStream outFile = new FileOutputStream(new File(FileName));
            workbook.write(outFile);
            outFile.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Write Integer Data On Multiple Cell.
     * Enter Stating Row Number For Start Writing On That Row.
     * Enter Stating and Ending Cell Number.
     *
     * @param FileName
     * @param SheetNumber
     * @param StartRow
     * @param StartCell
     * @param EndCell
     * @param IntegerNumber
     */
    public static void writeIntDataOnMultipalCell(String FileName, int SheetNumber, int StartRow, int StartCell, int EndCell, int IntegerNumber) {
        try {

            FileInputStream file = new FileInputStream(new File(FileName).getAbsolutePath());

            HSSFWorkbook workbook = new HSSFWorkbook(file);

            HSSFSheet sheet = workbook.getSheetAt(SheetNumber);

            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()) {

                Row row = rowIterator.next();
                if (row.getRowNum() >= StartRow) {

                    int row1 = row.getRowNum();

                    Cell cell = null;

                    for (int i = StartCell; i <= EndCell; i++) {
                        cell = sheet.getRow(row1).createCell(i);

                        cell.setCellValue((int) IntegerNumber);

                    }
                }

            }
            file.close();

            FileOutputStream outFile = new FileOutputStream(new File(FileName));
            workbook.write(outFile);
            outFile.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Write Float Data On Multiple Cell.
     * Enter Stating Row Number For Start Writing On That Row.
     * Enter Stating and Ending Cell Number.
     *
     * @param FileName
     * @param SheetNumber
     * @param StartRow
     * @param StartCell
     * @param EndCell
     * @param FloatNumber
     */
    public static void writeFloatDataOnMultipalCell(String FileName, int SheetNumber, int StartRow, int StartCell, int EndCell, float FloatNumber) {
        try {

            FileInputStream file = new FileInputStream(new File(FileName).getAbsolutePath());

            HSSFWorkbook workbook = new HSSFWorkbook(file);

            HSSFSheet sheet = workbook.getSheetAt(SheetNumber);

            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()) {

                Row row = rowIterator.next();
                if (row.getRowNum() >= StartRow) {

                    int row1 = row.getRowNum();

                    Cell cell = null;

                    for (int i = StartCell; i <= EndCell; i++) {
                        cell = sheet.getRow(row1).createCell(i);

                        cell.setCellValue((float) FloatNumber);

                    }
                }

            }
            file.close();

            FileOutputStream outFile = new FileOutputStream(new File(FileName));
            workbook.write(outFile);
            outFile.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Write String Data On Multiple Cell.
     * Enter Row Number For Selecting Row in Multiple Cell Enter Text.
     * Enter Stating and Ending Cell Number.
     *
     * @param FileName
     * @param SheetNumber
     * @param RowNumber
     * @param StartCell
     * @param EndCell
     * @param Text
     */
    public static void writeStringDataOnSingleRowMultipalCell(String FileName, int SheetNumber, int RowNumber, int StartCell, int EndCell, String Text) {
        try {

            FileInputStream file = new FileInputStream(new File(FileName).getAbsolutePath());

            HSSFWorkbook workbook = new HSSFWorkbook(file);

            HSSFSheet sheet = workbook.getSheetAt(SheetNumber);

            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()) {

                Row row = rowIterator.next();
                if (row.getRowNum() == RowNumber) {

                    int row1 = row.getRowNum();

                    Cell cell = null;

                    for (int i = StartCell; i <= EndCell; i++) {
                        cell = sheet.getRow(row1).createCell(i);

                        cell.setCellValue((String) Text);

                    }
                }

            }
            file.close();

            FileOutputStream outFile = new FileOutputStream(new File(FileName));
            workbook.write(outFile);
            outFile.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Write Integer Data On Multiple Cell.
     * Enter Row Number For Selecting Row in Multiple Cell Enter Text.
     * Enter Stating and Ending Cell Number.
     *
     * @param FileName
     * @param SheetNumber
     * @param RowNumber
     * @param StartCell
     * @param EndCell
     * @param IntegerNumber
     */
    public static void writeIntDataOnSingleRowMultipalCell(String FileName, int SheetNumber, int RowNumber, int StartCell, int EndCell, int IntegerNumber) {
        try {

            FileInputStream file = new FileInputStream(new File(FileName).getAbsolutePath());

            HSSFWorkbook workbook = new HSSFWorkbook(file);

            HSSFSheet sheet = workbook.getSheetAt(SheetNumber);

            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()) {

                Row row = rowIterator.next();
                if (row.getRowNum() == RowNumber) {

                    int row1 = row.getRowNum();

                    Cell cell = null;

                    for (int i = StartCell; i <= EndCell; i++) {
                        cell = sheet.getRow(row1).createCell(i);

                        cell.setCellValue((int) IntegerNumber);

                    }
                }

            }
            file.close();

            FileOutputStream outFile = new FileOutputStream(new File(FileName));
            workbook.write(outFile);
            outFile.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Write Float Data On Multiple Cell.
     * Enter Row Number For Selecting Row in Multiple Cell Enter Text.
     * Enter Stating and Ending Cell Number.
     *
     * @param FileName
     * @param SheetNumber
     * @param RowNumber
     * @param StartCell
     * @param EndCell
     * @param FloatNumber
     */
    public static void writeFloatDataOnSingleRowMultipalCell(String FileName, int SheetNumber, int RowNumber, int StartCell, int EndCell, float FloatNumber) {
        try {

            FileInputStream file = new FileInputStream(new File(FileName).getAbsolutePath());

            HSSFWorkbook workbook = new HSSFWorkbook(file);

            HSSFSheet sheet = workbook.getSheetAt(SheetNumber);

            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()) {

                Row row = rowIterator.next();
                if (row.getRowNum() == RowNumber) {

                    int row1 = row.getRowNum();

                    Cell cell = null;

                    for (int i = StartCell; i <= EndCell; i++) {
                        cell = sheet.getRow(row1).createCell(i);

                        cell.setCellValue((float) FloatNumber);

                    }
                }

            }
            file.close();

            FileOutputStream outFile = new FileOutputStream(new File(FileName));
            workbook.write(outFile);
            outFile.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}
