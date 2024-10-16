public class Company {
    private String cif;
    private String comapnyName;

    public Company() {
    }

    public Company(String cif, String comapnyName) {
        this.cif = cif;
        this.comapnyName = comapnyName;
    }

    //Getters y Setters

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getComapnyName() {
        return comapnyName;
    }

    public void setComapnyName(String comapnyName) {
        this.comapnyName = comapnyName;
    }
}
