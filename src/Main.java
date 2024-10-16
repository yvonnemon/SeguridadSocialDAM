import java.io.IOException;

public class Main {

    static UserInput userInput = new UserInput();
    static Worker worker = new Worker();
    static Company company = new Company();
    static Contract contract = new Contract();
    static Address address;

    public static void main(String[] args) throws IOException {

        startupMessages();

        inputWorkerData();

        System.out.println("Ahora los datos sobre la empresa");

        inputCompanyData();

        contract.setAltaBaja(userInput.userBooleanSex("¿Se desea tramitar una Alta o una baja? (A o B)"));
        Boolean altabaja = contract.getAltaBaja();

        if (altabaja) {
            registerInSocialSecurity();
        } else {
            deregisterFromSocialSecurity();
        }
    }

    public static void startupMessages() {
        System.out.println("Bienvenido al sistema de Altas/Bajas de la Seguridad Social");
        System.out.println("A continuación se le solicitarán los datos del trabajador a tramitar");
    }

    public static void inputWorkerData() throws IOException {
        worker.setName(userInput.userString("Nombre"));
        worker.setFirstSurname(userInput.userString("Primer Apellido"));
        worker.setSecondSurname(userInput.userString("Segundo Apellido (opcional)"));
        worker.setNif(userInput.userString("DNI"));
        worker.setNuss(userInput.userString("Número de la Seguridad Social"));
        worker.setBirthdate(userInput.userLocalDate("Fecha de nacimiento"));
        worker.setPhoneNumber(userInput.userString("Número de telefono"));
        worker.setSex(userInput.userChar("Sexo (M, F, O)"));
        address.setStreet(userInput.userString("Calle"));
        address.setNumber(userInput.userInteger("Número"));
        address.setAdditionalInfo(userInput.userString("Información adicional"));
        address.setLocality(userInput.userString("Localidad"));
        address.setProvince(userInput.userString("Provincia"));
        address.setPostalCode(userInput.userInteger("Código postal"));
        worker.setDomicile(createDomicile());
    }

    public static Address createDomicile() {
        address = new Address(
                address.getStreet(),
                address.getNumber(),
                address.getAdditionalInfo(),
                address.getLocality(),
                address.getPostalCode(),
                address.getProvince());
        return address;
    }

    public static void inputCompanyData() throws IOException {
        company.setCif(userInput.userString("CIF"));
        company.setComapnyName(userInput.userString("Nombre de la empresa"));
    }

    public static void registerInSocialSecurity() throws IOException {
        contract.setContractID(userInput.userInteger("Identidicador del contrato"));
        contract.setQuoteGroup(userInput.userInteger("Grupo de cotización"));
        contract.setWorkingType(userInput.userInteger("Tipo de jornada"));
        contract.setProfessionalCategory(userInput.userString("Categoría profesional"));
        //info adicional de la clase Alta
    }

    public static void deregisterFromSocialSecurity() throws IOException {
        contract.setContractID(userInput.userInteger("Identidicador del contrato"));
        contract.setQuoteGroup(userInput.userInteger("Grupo de cotización"));
        contract.setWorkingType(userInput.userInteger("Tipo de jornada"));
        contract.setProfessionalCategory(userInput.userString("Categoría profesional"));
        //info adicional de la clase Baja
    }

}