package ma.cigma.pfe.service;

import ma.cigma.pfe.models.Facture;

import java.util.List;

public interface IFactureService
{
    Facture save(Facture f);
    Facture modify(Facture newFacture);
    void removeById(long id);
    Facture getById(long id);
    List<Facture> getAll();



}
