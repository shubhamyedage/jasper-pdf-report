package com.report.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReportText {
  private String title = "AMAT's Financial Condition Analysis for the period\n"
      + "from 01.01.2008 to 31.12.2009";
  private String index1 = "1. AMAT's Financial Position Analysis";
  private String index1_1 = "1.1 Structure of the Assets and Liabilities";
  private String index1_2 = "1.2 Net Assets (Net Worth)";
  private String index1_3 = "1.3 Financial Sustainability Analysis";
  private String index1_3_1 = "1.3.1 Key ratios of the company's financial sustainability";
  private String index1_3_2 = "1.3.2 Working capital analysis";
  private String index1_4 = "1.4 Liquidity Analysis";
  private String index2 = "2. Financial Performance";
  private String index2_1 = "2.1 Overview of the Financial Results";
  private String index2_2 = "2.2 Profitability Ratios";
  private String index2_3 = "2.3 Analysis of the Business Activity (Turnover Ratios)";
  private String index3 = "3 Conclusion";
  private String index3_1 = "3.1 Key Ratios Summary";
  private String index3_2 = "3.2 Rating of the Financial Position and Financial Performance";
  private String index4 = "4. Appendix";
  private String index4_1 = "4.1 Bankruptcy Test (Altman Z-score)";
  private String index4_2 = "4.2 Calculation of the Final Rating of the Financial";
  private String section_1_text_1 =
      "The analysis given below on AMAT’s financial state and operating efficiency is made for the period from 01.10.2014 to04.10.2017 based on the financial statements data prepared according to International Financial Reporting Standards (IFRS).";
  private String section_1_text_2 =
      "AMAT's assets are described with the following correlation on the last day of the period analysed (04.10.2017): non-current assets are 33.27%, while current assets are 66.73%. The assets appreciably climbed to $ 19078.0 m ($ 5904.0 m) for the last four years. At the same time, equity has grown even more (10.78% during the last four years). An outrunning growth of equity is a factor with positive influence on the financial stability of AMAT.";
  private List<String> section_1_cause_1 = new ArrayList<String>(Arrays.asList(
      "Cash Equivalents $ 1661.0m (66.6%)", "Other Short Term Investments $ 1793.0m (1120.62%)"));
  private String section_1_text_3 =
      "At the same time, the most significant growth in the section 'Equity and Liabilities' of the balance sheet was seen on the item Long-term debt by $ 3356.0 m, that was 172.37% of all growth changed sources of the company's finances. The most significantly changed items on the balance sheet during the entire period analysed are Other Short Term Investments in assets and Long-term debt in sources of finance ($ 1793.0 m and $ 3356.0 m, respectively). Correlation of basic asset groups is demonstrated in the chart below.";

  public ReportText() {}

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getIndex1() {
    return index1;
  }

  public void setIndex1(String index1) {
    this.index1 = index1;
  }

  public String getIndex1_1() {
    return index1_1;
  }

  public void setIndex1_1(String index1_1) {
    this.index1_1 = index1_1;
  }

  public String getIndex1_2() {
    return index1_2;
  }

  public void setIndex1_2(String index1_2) {
    this.index1_2 = index1_2;
  }

  public String getIndex1_3() {
    return index1_3;
  }

  public void setIndex1_3(String index1_3) {
    this.index1_3 = index1_3;
  }

  public String getIndex1_3_1() {
    return index1_3_1;
  }

  public void setIndex1_3_1(String index1_3_1) {
    this.index1_3_1 = index1_3_1;
  }

  public String getIndex1_3_2() {
    return index1_3_2;
  }

  public void setIndex1_3_2(String index1_3_2) {
    this.index1_3_2 = index1_3_2;
  }

  public String getIndex1_4() {
    return index1_4;
  }

  public void setIndex1_4(String index1_4) {
    this.index1_4 = index1_4;
  }

  public String getIndex2() {
    return index2;
  }

  public void setIndex2(String index2) {
    this.index2 = index2;
  }

  public String getIndex2_1() {
    return index2_1;
  }

  public void setIndex2_1(String index2_1) {
    this.index2_1 = index2_1;
  }

  public String getIndex2_2() {
    return index2_2;
  }

  public void setIndex2_2(String index2_2) {
    this.index2_2 = index2_2;
  }

  public String getIndex2_3() {
    return index2_3;
  }

  public void setIndex2_3(String index2_3) {
    this.index2_3 = index2_3;
  }

  public String getIndex3() {
    return index3;
  }

  public void setIndex3(String index3) {
    this.index3 = index3;
  }

  public String getIndex3_1() {
    return index3_1;
  }

  public void setIndex3_1(String index3_1) {
    this.index3_1 = index3_1;
  }

  public String getIndex3_2() {
    return index3_2;
  }

  public void setIndex3_2(String index3_2) {
    this.index3_2 = index3_2;
  }

  public String getIndex4() {
    return index4;
  }

  public void setIndex4(String index4) {
    this.index4 = index4;
  }

  public String getIndex4_1() {
    return index4_1;
  }

  public void setIndex4_1(String index4_1) {
    this.index4_1 = index4_1;
  }

  public String getIndex4_2() {
    return index4_2;
  }

  public void setIndex4_2(String index4_2) {
    this.index4_2 = index4_2;
  }

  public String getSection_1_text_1() {
    return section_1_text_1;
  }

  public void setSection_1_text_1(String section_1_text_1) {
    this.section_1_text_1 = section_1_text_1;
  }

  public String getSection_1_text_2() {
    return section_1_text_2;
  }

  public void setSection_1_text_2(String section_1_text_2) {
    this.section_1_text_2 = section_1_text_2;
  }

  public List<String> getSection_1_cause_1() {
    return section_1_cause_1;
  }

  public void setSection_1_cause_1(List<String> section_1_cause_1) {
    this.section_1_cause_1 = section_1_cause_1;
  }

  public String getSection_1_text_3() {
    return section_1_text_3;
  }

  public void setSection_1_text_3(String section_1_text_3) {
    this.section_1_text_3 = section_1_text_3;
  }
}
