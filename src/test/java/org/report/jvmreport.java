package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class jvmreport {
public static void jreport(String jsonFilePath) {
File f=new File("src\\test\\resources\\jvmreport");
Configuration c=new Configuration(f, "facebook");
c.addClassifications("browse", "Chrome");
c.addClassifications("browser", "Version=69.8");
c.addClassifications("os", "windows 10");
List<String>l=new ArrayList<String>();
l.add(jsonFilePath);
ReportBuilder r=new ReportBuilder(l, c);
r.generateReports();
}
}
