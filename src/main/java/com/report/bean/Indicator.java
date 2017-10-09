package com.report.bean;

public class Indicator {
  private String name;
  private Double value1;
  private Double value2;
  private Double value3;
  private Double value4;
  private Double percentageValueBeginning;
  private Double percentageValueEnd;
  private Double change;
  private Double percentageChange;
  private String description;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getValue1() {
    return value1;
  }

  public void setValue1(Double value1) {
    this.value1 = value1;
  }

  public Double getValue2() {
    return value2;
  }

  public void setValue2(Double value2) {
    this.value2 = value2;
  }

  public Double getValue3() {
    return value3;
  }

  public void setValue3(Double value3) {
    this.value3 = value3;
  }

  public Double getValue4() {
    return value4;
  }

  public void setValue4(Double value4) {
    this.value4 = value4;
  }

  public Double getPercentageValueBeginning() {
    return percentageValueBeginning;
  }

  public void setPercentageValueBeginning(Double percentageValueBeginning) {
    this.percentageValueBeginning = percentageValueBeginning;
  }

  public Double getPercentageValueEnd() {
    return percentageValueEnd;
  }

  public void setPercentageValueEnd(Double percentageValueEnd) {
    this.percentageValueEnd = percentageValueEnd;
  }

  public Double getChange() {
    return change;
  }

  public void setChange(Double change) {
    this.change = change;
  }

  public Double getPercentageChange() {
    return percentageChange;
  }

  public void setPercentageChange(Double percentageChange) {
    this.percentageChange = percentageChange;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
