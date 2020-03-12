import java.util.Objects;

public class Item {

    private String id;
    private String name;
    private double price;
    private double tax;

    public Item(String id, String name, double price, double tax) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Item [" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", tax=" + tax +
                ']';
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (!(other instanceof Item)) return false;

        Item item = (Item) other;
        return item.id.equals(id) &&
                item.name.equals(name) &&
                item.price == price &&
                item.tax == tax;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, tax);
    }
}

/*
 * The above Java class definition can be represented in Kotlin as follows:
 *
 *      data class Item(var id: String,
 *                      var name: String,
 *                      var price: Double,
 *                      var tax: Double)
 *
 */
