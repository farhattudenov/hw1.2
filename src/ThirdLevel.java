final class ThirdLevel extends SecondLevel {
    private Enum thirdField;

    public ThirdLevel(int firstField, ComplexType secondField, Enum thirdField) {
        super(firstField, secondField);
        this.thirdField = thirdField;
    }

    public Enum getThirdField() {
        return thirdField;
    }

    @Override
    public void overloadedMethod() {
        super.overloadedMethod();
        System.out.println("Overridden method in ThirdLevel");
    }
}

