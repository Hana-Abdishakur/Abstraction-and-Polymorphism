public class TypeChecker {

    public void identifyObjectType(Parent obj) {
        if (obj instanceof Child1) {
            System.out.println("The object is an instance of Child1.");
        } else if (obj instanceof Child2) {
            System.out.println("The object is an instance of Child2.");
        } else {
            System.out.println("The object is an instance of Parent.");
        }
    }
}
