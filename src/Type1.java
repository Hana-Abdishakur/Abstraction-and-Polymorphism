public class Type1 implements ObjectBehavior{
    private final int attributeValue = 100;
    private final String detail1 = "Detail1 of Type1";

    @Override
    public void performAction() {
        System.out.println("Type1 is performing an action.");
    }

    @Override
    public void haltAction() {
        System.out.println("Type1 has halted its action.");
    }

    @Override
    public int getAttribute() {
        return attributeValue;
    }

    @Override
    public String getType() {
        return "Type1";
    }

    public String getDetail1() {
        return detail1;
    }
}
