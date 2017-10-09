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
    List<String> data = FileConfig.readCsvFile("report/data/table/amat1.1_table1.csv");
    List<Indicator> indicators = new ArrayList<Indicator>();
    // for (Object obj : data) {
    // String str = obj.toString();
    // String[] rowData = str.split(",");
    // Indicator indicator = new Indicator();
    // indicator.setName("Hii");
    // row.setName(rowData[0]);
    // row.setValue1(Double.parseDouble(rowData[1]));
    // row.setValue2(Double.parseDouble(rowData[2]));
    // row.setValue3(Double.parseDouble(rowData[3]));
    // row.setValue4(Double.parseDouble(rowData[4]));
    // row.setPercentageValueBeginning(Double.parseDouble(rowData[5]));
    // row.setPercentageValueEnd(Double.parseDouble(rowData[6]));
    // row.setChange(Double.parseDouble(rowData[7]));
    // row.setPercentageChange(Double.parseDouble(rowData[8]));
    // indicators.add(ind);
    // indicators.add(indicator);
    // }
    Indicator indicator = new Indicator();
    indicator.setName("1.Non current assets");
    indicator.setValue1(6207.00);
    indicator.setValue2(6047.00);
    indicator.setValue3(6235.00);
    indicator.setValue4(6347.00);
    indicator.setPercentageValueBeginning(47.12);
    indicator.setPercentageValueEnd(33.27);
    indicator.setChange(140.00);
    indicator.setPercentageChange(2.26);
    indicators.add(indicator);

    Indicator indicator1 = new Indicator();
    indicator1.setName("2.Current Assets total");
    indicator1.setValue1(6967.00);
    indicator1.setValue2(9261.00);
    indicator1.setValue3(8353.00);
    indicator1.setValue4(12731.00);
    indicator1.setPercentageValueBeginning(52.88);
    indicator1.setPercentageValueEnd(66.73);
    indicator1.setChange(5764.00);
    indicator1.setPercentageChange(82.73);
    indicators.add(indicator1);

    Indicator indicator2 = new Indicator();
    indicator2.setName("Inventory");
    indicator2.setValue1(1567.00);
    indicator2.setValue2(1833.00);
    indicator2.setValue3(2050.00);
    indicator2.setValue4(2876.00);
    indicator2.setPercentageValueBeginning(11.89);
    indicator2.setPercentageValueEnd(15.07);
    indicator2.setChange(1309.00);
    indicator2.setPercentageChange(83.54);
    indicators.add(indicator2);
    
    Indicator indicator3 = new Indicator();
    indicator3.setName("Trade and other current receivables");
    indicator3.setValue1(1670.00);
    indicator3.setValue2(1739.00);
    indicator3.setValue3(2279.00);
    indicator3.setValue4(2258.00);
    indicator3.setPercentageValueBeginning(12.68);
    indicator3.setPercentageValueEnd(11.84);
    indicator3.setChange(588.00);
    indicator3.setPercentageChange(35.21);
    indicators.add(indicator3);
    
    Indicator indicator4 = new Indicator();
    indicator4.setName("Cash and cash equivalents");
    indicator4.setValue1(3002.00);
    indicator4.setValue2(4797.00);
    indicator4.setValue3(3406.00);
    indicator4.setValue4(5278.00);
    indicator4.setPercentageValueBeginning(22.79);
    indicator4.setPercentageValueEnd(27.67);
    indicator4.setChange(2276.00);
    indicator4.setPercentageChange(75.82);
    indicators.add(indicator4);

    System.out.println(indicators.toString());
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
    getAssetsAndLiabilitiesStructureTable1();
    // getAssetsAndLiabilitiesStructureTable2();
    // getAssetsAndLiabilitiesStructureTable3();
    // getNetAssetsTable();
  }
}
