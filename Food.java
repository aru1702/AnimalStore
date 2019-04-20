
/**
 * Write a description of class Food here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Food extends Item
{
    private int weight;
    private boolean isVegetarian;

    public Food (int id, String name, int price, int stock, int weight, boolean isVegetarian) {
        super(id, name, price, stock);
        this.weight = weight;
        this.isVegetarian = isVegetarian;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @param isVegetarian the isVegetarian to set
     */
    public void setVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @return the isVegetarian
     */
    public boolean getIsVegetarian() {
        return isVegetarian;
    }

    @Override
    public void printData() {
        super.printData();
    }
}
