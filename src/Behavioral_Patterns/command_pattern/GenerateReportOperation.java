package Behavioral_Patterns.command_pattern;

public class GenerateReportOperation implements ReportOperation {
    private Report report;

    @Override
    public void execute() {
        report = new Report();
        report.generate();
    }
}
