package annuaire.dao;

import java.util.List;
import annuaire.model.*;

public interface implementAnnuaire {
    /**
     *
     * @param b
     */
    public void ajouter(annuaire b);

    /**
     *
     * @param b
     */
    public void update(annuaire b);

    /**
     *
     * @param id
     */
    public void supprimer(int id);

    /**
    A.F.BALBALI 11
    *
    * @return
    */
    public List<annuaire> getALL();
    
    /**
     *
     * @param nom
     * @return
     */
    public List<annuaire> getRechercheNom(String nom);
}