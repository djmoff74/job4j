package ru.job4j.inheritance;

/**
 * Class ReportUsage
 *
 * @author Eduard Lykov (djmoff74@gmail.com)
 * @version 1.0
 * @since 08.01.2020
 */
public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        HtmlReport htmlReport = new HtmlReport();
        JSONReport jsonReport = new JSONReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
        System.out.println();
        String textHtml = htmlReport.generate("Report's name", "Report's body");
        System.out.println(textHtml);
        System.out.println();
        String textJSON = jsonReport.generate("Report's name", "Report's body");
        System.out.println(textJSON);


    }
}
