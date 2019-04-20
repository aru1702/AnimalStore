
/**
 * Write a description of class Animal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Animal extends Item
{
    private String type;
    private String food;
    private int age;

    public Animal (int id, String name, int price, int stock, String type, String food, int age) {
        super(id, name, price, stock);
        this.type = type;
        this.food = food;
        this.age = age;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @param food the food to set
     */
    public void setFood(String food) {
        this.food = food;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @return the food
     */
    public String getFood() {
        return food;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    @Override
    public void printData() {
        super.printData();
    }
}
