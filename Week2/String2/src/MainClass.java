public class MainClass {
    public static void main(String args[]){
        Part1 obj1=new Part1();
        Part2 obj2=new Part2();
        Part3 obj3=new Part3();
        obj1.testPrintAllGenes();
        System.out.println("\n");
        obj1.testFindGene();
        System.out.println("\n");
        obj1.testFindStopCodon();
        System.out.println("\n\n\n");
        obj2.testHowMany();
        System.out.println("\n\n\n");
        obj3.testCountGenes();
    }
}
