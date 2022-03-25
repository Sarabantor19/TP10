import ma.cigma.pfe.models.CarteFidelio;
import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.models.Facture;
import ma.cigma.pfe.models.Promotion;
import ma.cigma.pfe.presentaion.ClientController;
import ma.cigma.pfe.presentaion.FactureController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Calendar;

import java.util.List;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");

        ClientController ctrl = (ClientController) context.getBean("idctrl");
        Client clientForm=new Client("sara");
        //List<Facture> factures = Arrays.asList(new Facture(1500.0,"facture1"),new Facture(2000.0,"facture2"));
        //clientForm.setFactures(factures);
        //List<Promotion> promotions=Arrays.asList(new Promotion("remise 10%"),new Promotion("solde 40%"));
       // clientForm.setPromotions(promotions);
        //CarteFidelio carteFidelio = new CarteFidelio("A29930489");
        //carteFidelio.setClient(clientForm);

        ctrl.save(clientForm);


// saving  four clients
        ctrl.save(new Client("OMAR"));
        ctrl.save(new Client("SIHAM"));
        ctrl.save(new Client("AHMED"));
        ctrl.save(new Client("SARAH"));
        ctrl.save(new Client("FARAH"));
        //ctrl.modify(new Client(1,"new Name"));

        //ctrl.removeById(1L);
       // Client found = ctrl.getById(1L);



        // facture

       // FactureController ctrlF = (FactureController) context.getBean("controllerFacture");

        // saving of factures
        //ctrlF.save(new Facture ( new Date(System.currentTimeMillis()), 1600.00));

        //ctrlF.save(new Facture(new Date(2020, 04,17), 800.88));
        //ctrlF.save(new Facture(new Date(2021, 04,17), 100.00));
        //ctrlF.save(new Facture(new Date(2022, 04,17), 200.00));
        //ctrlF.save(new Facture(new Date(2022, 05,22), 999.99));

        //modification des factures id==2
        //ctrlF.modify(new Facture(2L, new Date(System.currentTimeMillis()),2344.00));

        // supression de facture id==3
        //ctrlF.removeById(3L);
        // please note that I did some tests on the database
        // please note that I did some tests on the database

        // Test find use case for facture with id==1
        //Facture foundF = ctrlF.getById(1L);

        // Test get all factures
        //List<Facture> factureList = ctrlF.getAll();


    }
}
