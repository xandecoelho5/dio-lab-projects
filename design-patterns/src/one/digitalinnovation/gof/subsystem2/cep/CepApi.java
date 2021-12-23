package one.digitalinnovation.gof.subsystem2.cep;

public class CepApi {

    private static final CepApi instance = new CepApi();

    private CepApi() {
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String retrieveCity(String cep) {
        return "New York";
    }

    public String retrieveState(String cep) {
        return "NY";
    }
}
