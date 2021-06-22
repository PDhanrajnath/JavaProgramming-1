public class MainClass {
    public static void main(String args[]){
        Part1 obj1=new Part1();
        Part2 obj2=new Part2();
        Part3 obj3=new Part3();
        obj1.testFindStopCodon();
        System.out.println("\n");
        obj1.testFindGene();
        System.out.println("\n");
        obj1.testGetAllGenes();
        System.out.println("\n\n");
        obj2.testcgRatio();
        System.out.println("\n");
        obj2.testCountCTG();
        System.out.println("\n\n");
        obj3.testProcessGenes();
    }
}
