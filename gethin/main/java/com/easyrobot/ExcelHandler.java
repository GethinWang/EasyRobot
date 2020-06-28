package com.easyrobot;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandler {

    public static void main(String[] args) throws Exception {
        List<List<String>> res = ExcelHandler.readExcle("/Users/bjhl/Desktop/test.xlsx");
        ExcelHandler.writeExcel(res,new String[]{"11","11","11"},"/Users/bjhl/Desktop/test.xlsx");
    }

    public static List<List<String>> readExcle(String fileName) throws Exception {

        //new一个输入流
        FileInputStream inputStream = new FileInputStream(fileName);
        //new一个workbook
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        //创建一个sheet对象，参数为sheet的索引
        XSSFSheet sheet = workbook.getSheetAt(0);
        //new出存放一张表的二维数组
        List<List<String>> allData = new ArrayList<List<String>>();

        for (Row row:sheet) {
            List<String> oneRow = new ArrayList<String>();
            //不读表头
            if(row.getRowNum()==0)
                continue;
            for (Cell cell : row) {
                cell.setCellType(Cell.CELL_TYPE_STRING);
                oneRow.add(cell.getStringCellValue().trim());
            }
            allData.add(oneRow);
        }

        for (int i = 0; i < allData.size(); i++) {
            System.out.println(allData.get(i));
        }
        //关闭workbook
        workbook.close();
        return allData;
    }


    public static boolean writeExcel(List<List<String>> result,String[] sheetHead,String fileName){
        //创建一个workbook对应一个excel
        XSSFWorkbook workbook=new XSSFWorkbook();
        //在workbook中创建一个sheet
        XSSFSheet sheet = workbook.createSheet();
        //在sheet中创建第0行
        XSSFRow row=sheet.createRow(0);

        //设置表头
        for (int i = 0; i < sheetHead.length; i++) {
            row.createCell(i).setCellValue(sheetHead[i]);
        }
        //填写数据
        for (int i = 0; i < result.size(); i++) {
            XSSFRow row1 = sheet.createRow(i + 1);
            for (int j = 0; j <result.get(i).size() ; j++) {
                row1.createCell(j).setCellValue(result.get(i).get(j));
            }
        }
        //写入文件
        try {
            FileOutputStream file=new FileOutputStream(fileName);
            workbook.write(file);
            workbook.close();
            return true;
        }catch (IOException e){
            e.printStackTrace();
            return false;
        }
    }
}
