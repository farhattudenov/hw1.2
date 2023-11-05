public class Main {
    public static void main(String[] args) {
        ComplexType complexType = new ComplexType("Complex Data");
        Enum enumType = Enum.TYPE_A;

        SecondLevel objectA = new SecondLevel(100, complexType);
        ThirdLevel objectB = new ThirdLevel(200, complexType, enumType);
        ThirdLevel objectC = new ThirdLevel(300, complexType, enumType);


        System.out.println("Object A - First Level Field: " + objectA.getFirstField());
        System.out.println("Object A - Second Level Field: " + objectA.getSecondField().getData());

        System.out.println("Object B - First Level Field: " + objectB.getFirstField());
        System.out.println("Object B - Second Level Field: " + objectB.getSecondField().getData());
        System.out.println("Object B - Third Level Field: " + objectB.getThirdField());

        System.out.println("Object C - First Level Field: " + objectC.getFirstField());
        System.out.println("Object C - Second Level Field: " + objectC.getSecondField().getData());
        System.out.println("Object C - Third Level Field: " + objectC.getThirdField());


        objectA.overloadedMethod();
        objectA.nonOverridableMethod();

        objectB.overloadedMethod();
        objectC.overloadedMethod();
    }

}
