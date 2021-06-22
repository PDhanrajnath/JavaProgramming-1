public class AssignmentMain {
    public static void main(String args[]){
        Assignment obj=new Assignment();
        obj.testAverageTemperatureInFile();
        System.out.println();
        obj.testAverageTemperatureWithHighHumidityInFile();
        System.out.println();
        obj.testColdestHourInFile();
        System.out.println();
        obj.testFileWithColdestTemperature();
        System.out.println();
        obj.testLowestHumidityInManyFiles();
        System.out.println();
        obj.testLowestHumidityInFile();
    }
}
