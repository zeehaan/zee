package test5_Grouptable;

import java.lang.constant.Constable;

public class objectfile2 {
    String serialno;

    String space="\n"+"\n";

    String mark;

    String profile;
    String qty;
    String name;
    String material;
    String modelID;
    String unitwgt;
    String assembly;
    String guid;
    public objectfile2(String serialno, String mark, String profile, String qty, String name, String material, String modelID, String unitwgt, String assembly, String guid) {this.serialno = serialno;
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
    public objectfile2(String space) {
        this.space = space;
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

    public String getAssembly() {
        return assembly;
    }
    public Constable getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
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
}
//"objectfile{" +
//        "serialno=" + serialno +
//        ", mark='" + mark + '\'' +
//        ", profile='" + profile + '\'' +
//        ", qty=" + qty +
//        ", name='" + name + '\'' +
//        ", material='" + material + '\'' +
//        ", modelID='" + modelID + '\'' +
//        " " + unitwgt +
//        ", assembly='" + assembly + '\'' +
//        ", guid='" + guid + '\'' +
//        '}';