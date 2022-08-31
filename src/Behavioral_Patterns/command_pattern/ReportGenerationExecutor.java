package Behavioral_Patterns.command_pattern;

public class ReportGenerationExecutor {

    public void executeOperation(ReportOperation reportOperation){
        reportOperation.execute();
    }
}
