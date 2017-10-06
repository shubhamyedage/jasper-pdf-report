package com.report.bean_collector;

import java.util.ArrayList;
import java.util.List;

import com.report.bean.ReportTextBean;
import com.report.bean.Table_1_1;


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
  public static List<Table_1_1> getTableBeanCollector() {
    List<Table_1_1> table_1_1 = new ArrayList<Table_1_1>();
    Table_1_1 row_1 = new Table_1_1();
    row_1.setIndicator("1. Non-current assets");
    row_1.setValue1(6207.00);
    row_1.setValue2(6047.00);
    row_1.setValue3(6235.00);
    row_1.setValue4(6347.00);
    row_1.setPercentageValueBeginning(47.12);
    row_1.setPercentageValueEnd(33.27);
    row_1.setChange(140.00);
    row_1.setPercentageChange(2.26);
    table_1_1.add(row_1);
    return table_1_1;
  }
}
