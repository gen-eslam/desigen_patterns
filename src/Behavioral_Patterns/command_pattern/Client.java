package Behavioral_Patterns.command_pattern;

public class Client {
    public static void main(String[] args) {
        ReportGenerationExecutor reportGenerationExecutor = new ReportGenerationExecutor();
        reportGenerationExecutor.executeOperation(new GenerateReportOperation());
    }
}
