/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBpackage;

import Entities.Garagetypes;
import Entities.Propertytypes;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author benmc
 */
public class garageTypeDB {
    public static int getGTypeID(String Type){
    EntityManager em= DButil.getEmf().createEntityManager();
        TypedQuery tq = em.createNamedQuery("Garagetypes.findByGType", Garagetypes.class);
        tq.setParameter("gType", Type);
        Garagetypes newType = (Garagetypes)tq.getSingleResult();
        int id=newType.getGarageId();
        return id;
    }
}
