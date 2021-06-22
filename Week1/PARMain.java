public class PARMain {
    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        System.out.println("Assignment 1: Calculating information about shapes");
        pr.testPerimeter();
        System.out.println("\n\nAssignment 2: Processing multiple Shape files");
        pr.testPerimeterMultipleFiles();
    }
}
