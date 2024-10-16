import java.time.LocalDate; //YYYY-MM-DD

public class Worker {

    private String name;
    private String firstSurname;
    private String secondSurname;
    private String nif;
    private String nuss; //Creo que es alfanumerico
    private LocalDate birthdate;
    private Address domicile;
    private String phoneNumber;
    private Character sex; //M, F, pendiente de ver como se califica de Otros

    public Worker() {
    }

    public Worker(String name,
                  String firstSurname,
                  String nif,
                  String nuss,
                  LocalDate birthdate,
                  Address domicile,
                  String phoneNumber,
                  Character sex) {
        this.name = name;
        this.firstSurname = firstSurname;
        this.nif = nif;
        this.nuss = nuss;
        this.birthdate = birthdate;
        this.domicile = domicile;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }

    public Worker(String name,
                  String firstSurname,
                  String secondSurname,
                  String nif,
                  String nuss,
                  LocalDate birthdate,
                  Address domicile,
                  String phoneNumber,
                  Character sex) {
        this.name = name;
        this.firstSurname = firstSurname;
        this.secondSurname = secondSurname;
        this.nif = nif;
        this.nuss = nuss;
        this.birthdate = birthdate;
        this.domicile = domicile;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }

    //Getters y Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public String getFirstSurname() {
        return firstSurname;
    }

    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public Address getDomicile() {
        return domicile;
    }

    public void setDomicile(Address domicile) {
        this.domicile = domicile;
    }

    public String getNuss() {
        return nuss;
    }

    public void setNuss(String nuss) {
        this.nuss = nuss;
    }
}
