
package lab7p2_carlosespinal;

public class Producto {
    private int id;
    private String name;
    private int category;
    private double price;
    private int aisle;
    private int bin;

    public Producto() {
    }

    public Producto(int id, String name, int category, double price, int aisle, int bin) {
        setId(id);
        this.name = name;
        setCategory(category);
        this.price = price;
        this.aisle = aisle;
        this.bin = bin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
            this.id = id;
        
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        if (category >= 0 && category <= 9) {
          this.category = category;  
        }
        
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAisle() {
        return aisle;
    }

    public void setAisle(int aisle) {
        this.aisle = aisle;
    }

    public int getBin() {
        return bin;
    }

    public void setBin(int bin) {
        this.bin = bin;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", aisle=" + aisle + ", bin=" + bin + '}';
    }
    
    
    
}
