public class Main3 {
    
    public static void main(String[] args) {
        Child1 ch1 = new Child1(10, "Aman", 100);
        Child2 ch2 = new Child2(8, "Azhar", 100);

        ch1.showDetails();
        ch2.showDetails();

        TypeChecker typeChecker = new TypeChecker();
        typeChecker.identifyObjectType(ch1);
        typeChecker.identifyObjectType(ch2);
    }
}
