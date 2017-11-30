/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBpackage;

import Entities.Propertytypes;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author benmc
 */
public class propertyTypeDB {
    public static int getTypeID(String Type){
        EntityManager em= DButil.getEmf().createEntityManager();
        TypedQuery tq = em.createNamedQuery("Propertytypes.findByPType", Propertytypes.class);
        tq.setParameter("pType", Type);
        Propertytypes newType = (Propertytypes)tq.getSingleResult();
        int id=newType.getTypeId();
        return id;
        
    }
}
