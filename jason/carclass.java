package jason;

public class carclass {
    int modelnumber;
    String modelname;
    String colour;
    int price;
    int mileage;
    int cc;
    public carclass(int modelnumber, String modelname, String colour, int price, int mileage, int cc) {

        this.modelnumber = modelnumber;
        this.modelname = modelname;
        this.colour = colour;
        this.price = price;
        this.mileage = mileage;
        this.cc = cc;
    }
    public int getModelnumber() {
        return modelnumber;
    }
    public void setModelnumber(int modelnumber) {
        this.modelnumber = modelnumber;
    }
    public String getModelname() {
        return modelname;
    }
    public void setModelname(String modelname) {
        this.modelname = modelname;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getMileage() {
        return mileage;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    public int getCc() {
        return cc;
    }
    public void setCc(int cc) {
        this.cc = cc;
    }
}
