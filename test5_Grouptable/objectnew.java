package test5_Grouptable;

public class objectnew {
    String serialno2;

    String standard;
    String site_shop;
     String size;
    String qty;
    String sumqnt;
    String length;
    String mainpart;

    objectnew(String mainpart,String size,String sumqnt,String standard,String site_shop,String length){
        this.mainpart=mainpart;
        this.size =size;
        this.sumqnt=sumqnt;
        this.standard=standard;
        this.site_shop=site_shop;
        this.length=length;
    }

    public void setSerialno2(String serialno2) {
        this.serialno2 = serialno2;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public void setSite_shop(String site_shop) {
        this.site_shop = site_shop;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public void setMainpart(String mainpart) {
        this.mainpart = mainpart;
    }

    public String getSumqnt() {
        return sumqnt;
    }

    public void setSumqnt(String sumqnt) {
        this.sumqnt = sumqnt;
    }

    @Override
    public String toString() {
        return "\n"+"objectnew{" +
                "serialno2='" + serialno2 + '\'' +
                ", standard='" + standard + '\'' +
                ", site_shop='" + site_shop + '\'' +
                ", size='" + size + '\'' +
                ", qty='" + qty + '\'' +
                ", length='" + length + '\'' +
                ", mainpart='" + mainpart + '\'' +"Sum="+sumqnt+
                '}';
    }

    public objectnew(String serialno2, String standard, String site_shop, String size, String qty, String length, String mainpart) {
        this.serialno2 = serialno2;
        this.standard = standard;
        this.site_shop = site_shop;
        this.size = size;
        this.qty = qty;
        this.length = length;
        this.mainpart = mainpart;


    }

    public String getSerialno2() {
        return serialno2;
    }

    public String getStandard() {
        return standard;
    }
    public String getSite_shop() {
        return site_shop;
    }

    public String getSize() {
        return size;
    }

    public String getQty() {
        return qty;
    }

    public String getLength() {
        return length;
    }

    public String getMainpart() {
        return mainpart;
    }

    public objectnew(String serialno2, String standard, String site_shop, String size, String qty, String sumqnt, String length, String mainpart) {
        this.serialno2 = serialno2;
        this.standard = standard;
        this.site_shop = site_shop;
        this.size = size;
        this.qty = qty;
        this.sumqnt = sumqnt;
        this.length = length;
        this.mainpart = mainpart;
    }
}
