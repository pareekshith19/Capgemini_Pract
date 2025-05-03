package Day3.Annotations.Exercise;
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

class IssueTracker {
    @BugReport(description = "Null pointer exception")
    @BugReport(description = "Array index out of bounds")
    public void reportBugs() {
        System.out.println("Bugs reported");
    }
}

public class Main5 {
    public static void main(String[] args) throws Exception {
        Method method = IssueTracker.class.getMethod("reportBugs");
        BugReport[] reports = method.getAnnotationsByType(BugReport.class);
        for (BugReport report : reports) {
            System.out.println("Bug: " + report.description());
        }
        new IssueTracker().reportBugs();
    }
}
