public abstract class ItemFabric {

    public abstract iGameItem createItem();

    public void openReward(){
        iGameItem gameItem = createItem();
        gameItem.open();
    }
}
