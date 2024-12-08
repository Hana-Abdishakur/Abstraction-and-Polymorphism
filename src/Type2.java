public class Type2 implements ObjectBehavior{
    private final int attributeValue = 200;
    private final String detail2 = "Detail2";


    @Override
    public void performAction() {
        System.out.println("Type2 is performing an action.");
    }

    @Override
    public void haltAction() {
        System.out.println("Type2 has halted the action.");
    }

    @Override
    public int getAttribute() {
        return attributeValue;
    }

    @Override
    public String getType() {
        return "Type2";
    }
    public String getDetail2() {
        return detail2;
    }
}
