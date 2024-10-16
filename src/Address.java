public class Address {
    private String street;
    private Integer number;
    private String additionalInfo;
    private String locality;
    private Integer postalCode;
    private String province;

    public Address(String street,
                   Integer number,
                   String locality,
                   Integer postalCode,
                   String province) {
        this.street = street;
        this.number = number;
        this.locality = locality;
        this.postalCode = postalCode;
        this.province = province;
    }

    public Address(String street,
                   Integer number,
                   String additionalInfo,
                   String locality,
                   Integer postalCode,
                   String province) {
        this.street = street;
        this.number = number;
        this.additionalInfo = additionalInfo;
        this.locality = locality;
        this.postalCode = postalCode;
        this.province = province;
    }

    //Getters y Setters

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}


