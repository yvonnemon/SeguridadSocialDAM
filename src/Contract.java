public class Contract {
    private Boolean altaBaja; //Alta true, Baja false
    private Integer contractID;
    private Integer quoteGroup;
    private Integer workingType;
    private String professionalCategory;


    public Contract() {
    }

    public Contract(Integer contractID,
                    Integer quoteGroup,
                    Integer workingType,
                    String professionalCategory,
                    Boolean altaBaja) {
        this.contractID = contractID;
        this.quoteGroup = quoteGroup;
        this.workingType = workingType;
        this.professionalCategory = professionalCategory;
        this.altaBaja = altaBaja;
    }

    //Getters y Setters

    public Integer getQuoteGroup() {
        return quoteGroup;
    }

    public void setQuoteGroup(Integer quoteGroup) {
        this.quoteGroup = quoteGroup;
    }

    public Integer getWorkingType() {
        return workingType;
    }

    public void setWorkingType(Integer workingType) {
        this.workingType = workingType;
    }

    public String getProfessionalCategory() {
        return professionalCategory;
    }

    public void setProfessionalCategory(String professionalCategory) {
        this.professionalCategory = professionalCategory;
    }

    public Integer getContractID() {
        return contractID;
    }

    public void setContractID(Integer contractID) {
        this.contractID = contractID;
    }

    public Boolean getAltaBaja() {
        return altaBaja;
    }

    public void setAltaBaja(Boolean altaBaja) {
        this.altaBaja = altaBaja;
    }
}
