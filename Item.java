public class Item
{
    private String itemDescription;
    private int itemWeight;

    public Item()
    {
        itemDescription = "Poción de invisibilidad";
        itemWeight = 5;
    }

    public String getItemDescription(){
        return itemDescription;
    }

    public int getItemWeight(){
        return itemWeight;
    }
}
