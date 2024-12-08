public class Child2 extends Parent{

    double TestOfDNA2;

    public Child2(int age, String name,double testOfDNA1){
        super(age,name);
        this.TestOfDNA2 = TestOfDNA2;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("TestOfDNA2:" +TestOfDNA2);
    }
}
