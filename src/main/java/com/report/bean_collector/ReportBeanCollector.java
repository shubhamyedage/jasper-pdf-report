package com.report.bean_collector;

import java.util.ArrayList;
import java.util.List;

import com.report.bean.ReportTextBean;
import com.report.bean.Table_1_1;
import com.report.config.FileConfig;


/**
 * This class returns bean collector for jasper studio adapter.
 * 
 * @author synerzip
 * 
 */
public class ReportBeanCollector {
  // Common collector for report text.
  public static List<ReportTextBean> getTextBeanCollector() {
    List<ReportTextBean> reportTextBean = new ArrayList<ReportTextBean>();
    reportTextBean.add(new ReportTextBean());
    return reportTextBean;
  }

  // Collector for report.
  public static List<Table_1_1> getTableBeanCollector1() {
    List<Table_1_1> table_1_1 = new ArrayList<Table_1_1>();
    List<String> data = FileConfig.readCsvFile("report/data/table/table_1_1.csv");
    for (Object obj : data) {
      String str = obj.toString();
      String[] rowData = str.split(",");
      Table_1_1 row = new Table_1_1();
      row.setIndicator(rowData[0]);
      row.setValue1(Double.parseDouble(rowData[1]));
      row.setValue2(Double.parseDouble(rowData[2]));
      row.setValue3(Double.parseDouble(rowData[3]));
      row.setValue4(Double.parseDouble(rowData[4]));
      row.setPercentageValueBeginning(Double.parseDouble(rowData[5]));
      row.setPercentageValueEnd(Double.parseDouble(rowData[6]));
      row.setChange(Double.parseDouble(rowData[7]));
      row.setPercentageChange(Double.parseDouble(rowData[8]));
      System.out.println(row.toString());
      table_1_1.add(row);
    }
    return table_1_1;
  }

  public static void main(String[] args) {
    getTableBeanCollector1();
  }
}
