class SecondLevel extends FirstLevel {
    private ComplexType secondField;

    public SecondLevel(int firstField, ComplexType secondField) {
        super(firstField);
        this.secondField = secondField;
    }

    public ComplexType getSecondField() {
        return secondField;
    }

    public void overloadedMethod() {
        System.out.println("Overloaded method in SecondLevel");
    }

    public final void nonOverridableMethod() {
        System.out.println("Non-overridable method in SecondLevel");
    }
}