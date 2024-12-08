public class Child1 extends Parent{
    double TestOfDNA1;

    public Child1(int age, String name,double testOfDNA1){
        super(age,name);
        this.TestOfDNA1 = TestOfDNA1;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("TestOfDNA1:" +TestOfDNA1);
    }
}
