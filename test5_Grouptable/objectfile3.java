package test5_Grouptable;

public class objectfile3 {
    String serialno;
    String mark;
    String profile;
    String qty;
    String name;
    String material;
    String modelID;
    String unitwgt;
    static String assembly;
    String guid;
    public objectfile3(String serialno, String mark, String profile, String qty, String name, String material, String modelID, String unitwgt, String assembly, String guid) {this.serialno = serialno;
        this.mark = mark;
        this.profile = profile;
        this.qty = qty;
        this.name = name;
        this.material = material;
        this.modelID = modelID;
        this.unitwgt = unitwgt;
        this.assembly = assembly;
        this.guid = guid;
    }
    public String getSerialno() {
        return serialno;
    }

    public String getMark() {
        return mark;
    }

    public String getProfile() {
        return profile;
    }

    public  String getQty() {
        return qty;
    }
    public static String getAssembly() {
        return assembly;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public String getModelID() {
        return modelID;
    }
    public String getUnitwgt() {
        return unitwgt;
    }

    public String getGuid() {
        return guid;
    }

    @Override
    public String toString() {
        return   serialno+"  " + mark + "  "  + profile + "  " + qty +"  "+ name +"  " + material + "  " + modelID + "  "  + unitwgt +"  " + assembly + "  " + guid  ;
    }

    public static <U extends Comparable<? super U>, T> U getAssembly(T t) {
        return (U) getAssembly();
    }
}
