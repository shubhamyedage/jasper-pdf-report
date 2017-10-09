package com.report.bean_collector;

import java.util.ArrayList;
import java.util.List;

import com.report.bean.Indicator;
import com.report.bean.ReportText;
import com.report.config.FileConfig;


/**
 * This class returns bean collector for jasper studio adapter.
 * 
 * @author synerzip
 * 
 */
public class ReportBeanCollector {
  // Common collector for report text.
  public static List<ReportText> getReportText() {
    ReportText reportText = new ReportText();
    List<ReportText> reportTextBean = new ArrayList<ReportText>();
    reportTextBean.add(reportText);
    return reportTextBean;
  }

  // Table data collector for Structure of the Assets and Liabilities Part 1.
  public static List<Indicator> getAssetsAndLiabilitiesStructureTable1() {
    // List<String> data = FileConfig.readCsvFile("report/data/table/amat1.1_table1.csv");
    // List<Indicator> tableDataSet = new ArrayList<Indicator>();
    // for (Object obj : data) {
    // String str = obj.toString();
    // String[] rowData = str.split(",");
    // Indicator row = new Indicator();
    // row.setName(rowData[0]);
    // row.setValue1(Double.parseDouble(rowData[1]));
    // row.setValue2(Double.parseDouble(rowData[2]));
    // row.setValue3(Double.parseDouble(rowData[3]));
    // row.setValue4(Double.parseDouble(rowData[4]));
    // row.setPercentageValueBeginning(Double.parseDouble(rowData[5]));
    // row.setPercentageValueEnd(Double.parseDouble(rowData[6]));
    // row.setChange(Double.parseDouble(rowData[7]));
    // row.setPercentageChange(Double.parseDouble(rowData[8]));
    // System.out.println(row.toString());
    // tableDataSet.add(row);
    // }
    // return tableDataSet;
    List<Indicator> indicators = new ArrayList<Indicator>();
    Indicator indicator = new Indicator();
    indicator.setName("Assets");
    indicators.add(indicator);
    return indicators;
  }

  //
  // // Table data collector for Structure of the Assets and Liabilities Part 2.
  // public static List<Indicator> getAssetsAndLiabilitiesStructureTable2() {
  // List<Indicator> tableDataSet = new ArrayList<Indicator>();
  // List<String> data = FileConfig.readCsvFile("report/data/table/amat1.1_table2.csv");
  // for (Object obj : data) {
  // String str = obj.toString();
  // String[] rowData = str.split(",");
  // Indicator row = new Indicator();
  // row.setName(rowData[0]);
  // row.setValue1(Double.parseDouble(rowData[1]));
  // row.setValue2(Double.parseDouble(rowData[2]));
  // row.setValue3(Double.parseDouble(rowData[3]));
  // row.setValue4(Double.parseDouble(rowData[4]));
  // row.setPercentageValueBeginning(Double.parseDouble(rowData[5]));
  // row.setPercentageValueEnd(Double.parseDouble(rowData[6]));
  // row.setChange(Double.parseDouble(rowData[7]));
  // row.setPercentageChange(Double.parseDouble(rowData[8]));
  // System.out.println(row.toString());
  // tableDataSet.add(row);
  // }
  // return tableDataSet;
  // }
  //
  // // Table data collector for Structure of the Assets and Liabilities Part 2.
  // public static List<Indicator> getAssetsAndLiabilitiesStructureTable3() {
  // List<Indicator> tableDataSet = new ArrayList<Indicator>();
  // List<String> data = FileConfig.readCsvFile("report/data/table/amat1.1_table3.csv");
  // for (Object obj : data) {
  // String str = obj.toString();
  // String[] rowData = str.split(",");
  // Indicator row = new Indicator();
  // row.setName(rowData[0]);
  // row.setValue1(Double.parseDouble(rowData[1]));
  // row.setValue2(Double.parseDouble(rowData[2]));
  // row.setValue3(Double.parseDouble(rowData[3]));
  // row.setValue4(Double.parseDouble(rowData[4]));
  // row.setPercentageValueBeginning(Double.parseDouble(rowData[5]));
  // row.setPercentageValueEnd(Double.parseDouble(rowData[6]));
  // row.setChange(Double.parseDouble(rowData[7]));
  // row.setPercentageChange(Double.parseDouble(rowData[8]));
  // System.out.println(row.toString());
  // tableDataSet.add(row);
  // }
  // return tableDataSet;
  // }
  //
  // // Table data collector for Net Assets.
  // public static List<Indicator> getNetAssetsTable() {
  // List<Indicator> tableDataSet = new ArrayList<Indicator>();
  // List<String> data = FileConfig.readCsvFile("report/data/table/amat1.2_table.csv");
  // for (Object obj : data) {
  // String str = obj.toString();
  // String[] rowData = str.split(",");
  // Indicator row = new Indicator();
  // row.setName(rowData[0]);
  // row.setValue1(Double.parseDouble(rowData[1]));
  // row.setValue2(Double.parseDouble(rowData[2]));
  // row.setValue3(Double.parseDouble(rowData[3]));
  // row.setValue4(Double.parseDouble(rowData[4]));
  // row.setPercentageValueBeginning(Double.parseDouble(rowData[5]));
  // row.setPercentageValueEnd(Double.parseDouble(rowData[6]));
  // row.setChange(Double.parseDouble(rowData[7]));
  // row.setPercentageChange(Double.parseDouble(rowData[8]));
  // System.out.println(row.toString());
  // tableDataSet.add(row);
  // }
  // return tableDataSet;
  // }
  //
  // // Table data collector for Financial Sustainability Key Ratios.
  // public static List<Indicator> getKeyRatiosTable() {
  // List<Indicator> tableDataSet = new ArrayList<Indicator>();
  // List<String> data = FileConfig.readCsvFile("report/data/table/amat1.3.1_table.csv");
  // for (Object obj : data) {
  // String str = obj.toString();
  // String[] rowData = str.split(",");
  // Indicator row = new Indicator();
  // row.setName(rowData[0]);
  // row.setValue1(Double.parseDouble(rowData[1]));
  // row.setValue2(Double.parseDouble(rowData[2]));
  // row.setValue3(Double.parseDouble(rowData[3]));
  // row.setValue4(Double.parseDouble(rowData[4]));
  // row.setChange(Double.parseDouble(rowData[5]));
  // row.setDescription(rowData[6]);
  // System.out.println(row.toString());
  // tableDataSet.add(row);
  // }
  // return tableDataSet;
  // }
  //
  // // Table data collector for Financial Sustainability Working Capital Analysis.
  // public static List<Indicator> getWorkingCapitalTable() {
  // List<Indicator> tableDataSet = new ArrayList<Indicator>();
  // List<String> data = FileConfig.readCsvFile("report/data/table/amat1.3.2_table.csv");
  // for (Object obj : data) {
  // String str = obj.toString();
  // String[] rowData = str.split(",");
  // Indicator row = new Indicator();
  // row.setName(rowData[0]);
  // row.setValue1(Double.parseDouble(rowData[1]));
  // row.setValue2(Double.parseDouble(rowData[2]));
  // row.setValue3(Double.parseDouble(rowData[3]));
  // row.setValue4(Double.parseDouble(rowData[4]));
  // row.setChange(Double.parseDouble(rowData[5]));
  // row.setChange(Double.parseDouble(rowData[6]));
  // System.out.println(row.toString());
  // tableDataSet.add(row);
  // }
  // return tableDataSet;
  // }

  public static void main(String[] args) {
    getReportText();
    // getAssetsAndLiabilitiesStructureTable1();
    // getAssetsAndLiabilitiesStructureTable2();
    // getAssetsAndLiabilitiesStructureTable3();
    // getNetAssetsTable();
  }
}
