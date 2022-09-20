package test3stream;
public class Person {
    private String serialno;
    private String mark;
    private String profile;
    private String quantity;
    private String name;
    private String material;
    private	String guid;
    public Person(String serialno, String mark, String profile, String quantity, String name, String material,
                  String guid)
    {
        this.serialno = serialno;
        this.mark = mark;
        this.profile = profile;
        this.quantity = quantity;
        this.name = name;
        this.material = material;
        this.guid = guid;
    }
    public String getSerialno() {return serialno;}
    public String getMark() {return mark;}
    public String getProfile() {return profile;}
    public String getQuantity() {return quantity;}
    public String getName() {return name;}
    public String getMaterial() {return material;}
    public String getGuid() {return guid;}
    @Override
    public String toString() {
        return "file [serialno=" + serialno + ", mark=" + mark + ", profile=" + profile + ", quantity=" + quantity
                + ", name=" + name + ", material=" + material + ", guid]";
    }

}


