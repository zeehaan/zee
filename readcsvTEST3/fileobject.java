package readcsvTEST3;

    class fileobject {
        public fileobject(String serialno, String name, String mark, String quantity, String profile, String guid, String material) {
            this.serialno = serialno;
            this.name = name;
            this.mark = mark;
            this.quantity = quantity;
            this.profile = profile;
            this.guid = guid;
            this.material = material;
        }

        String serialno;
        String name;
        String mark;
        String quantity;
        String profile;

        public fileobject() {

        }

        public String getSerialno() {
            return serialno;
        }

        public String getName() {
            return name;
        }

        public String getMark() {
            return mark;
        }

        public String getQuantity() {
            return quantity;
        }

        public String getProfile() {
            return profile;
        }

        public String getMaterial() {
            return material;
        }

        String guid;
        String material;


        public Object getGuid() {
            return guid;
        }
    }

