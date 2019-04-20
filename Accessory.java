
/**
 * Write a description of class Accessory here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Accessory extends Item
{
    private String type;

    public Accessory (int id, String name, int price, int stock, String type) {
        super(id, name, price, stock);
        this.type = type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    @Override
    public void printData() {
        super.printData();
    }
}
