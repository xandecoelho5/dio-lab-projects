package one.digitalinnovation.gof.Facade;

import one.digitalinnovation.gof.subsystem1.crm.CrmService;
import one.digitalinnovation.gof.subsystem2.cep.CepApi;

public class Facade {

    public void migrateCliente(String name, String cep) {
        String city = CepApi.getInstance().retrieveCity(cep);
        String state = CepApi.getInstance().retrieveState(cep);

        CrmService.storeClient(name, cep, city, state);
    }
}
