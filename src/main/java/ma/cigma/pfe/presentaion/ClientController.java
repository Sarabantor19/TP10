package ma.cigma.pfe.presentaion;

import ma.cigma.pfe.dao.IClientDao;
import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.service.ClientServiceImpl;
import ma.cigma.pfe.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("idctrl")

public class ClientController {



    @Autowired
    IClientService service ;

    public IClientService getService() {
        return service;
    }

    public void save(Client c){
        //  System.out.println("presentation layer level...");
        service.save(c);

    }



    public void modify(Client c){
        service.modify(c);
    }

    public void removeById(long id){
        service.removeById(id);
    }
    public Client getById(long id){
        return service.getById(id);
    }

}
