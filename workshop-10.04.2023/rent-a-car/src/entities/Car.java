package entities;

public class Car {
    private int id;
    private String model;
    private int unitBookingPrice;
    private int productionYear;
    private String colour;

    public Car() {
    }

    public Car(int id, String model, int unitBookingPrice, int productionYear, String colour) {
        this.id = id;
        this.model = model;
        this.unitBookingPrice = unitBookingPrice;
        this.productionYear = productionYear;
        this.colour = colour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getUnitBookingPrice() {
        return unitBookingPrice;
    }

    public void setUnitBookingPrice(int unitBookingPrice) {
        this.unitBookingPrice = unitBookingPrice;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
