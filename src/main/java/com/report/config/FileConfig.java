package com.report.config;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileConfig {
  public static List<String> readCsvFile(String fileName) {
    List<String> data = new ArrayList<String>();
    ClassLoader classLoader = FileConfig.class.getClassLoader();
    BufferedReader br = null;
    FileReader fileReader = null;
    try {
      fileReader = new FileReader(classLoader.getResource(fileName).getFile());
      br = new BufferedReader(fileReader);
      Stream<String> streamLines = br.lines();
      List<Object> dataList = streamLines.collect(Collectors.toList());
      for (Object line : dataList) {
        if (line != null) {
          String str = line.toString();
          System.out.println(str);
          data.add(str);
        }
      }
      br.close();
      fileReader.close();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    return data;
  }
}
