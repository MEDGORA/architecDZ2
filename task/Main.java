public class Main {
    public static void main(String[] args) {
        ItemFabric generator = new GoldGenerator();
        generator.openReward();
        generator = new GoldGenerator();
        generator = new GemGenerator();
        generator.openReward();
    }
}
