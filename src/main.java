public class main {
    public static void main(String[] arg) {
        BuilderPattern builderPattern = new BuilderPattern.Builder(1L)
                .withName("fares")
                .withAddress("oxford")
                .withBudget(180L)
                .withDiscountRate(2L).build();
        System.out.println(builderPattern.getName());
    }

}
