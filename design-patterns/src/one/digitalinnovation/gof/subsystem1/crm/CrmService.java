package one.digitalinnovation.gof.subsystem1.crm;

public class CrmService {

    private CrmService() {

    }

    public static void storeClient(String name, String cep, String city, String state){
        System.out.println("Client saved on CRM system.");
        System.out.println(name);
        System.out.println(cep);
        System.out.println(city);
        System.out.println(state);
    }
}
