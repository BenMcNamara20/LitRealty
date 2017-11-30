/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBpackage;

import Entities.Propertytypes;
import Entities.Styles;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author benmc
 */
public class styleTypeDB {
    public static int getTypeID(String Type){
        EntityManager em= DButil.getEmf().createEntityManager();
        TypedQuery tq = em.createNamedQuery("Styles.findByPStyle", Styles.class);
        tq.setParameter("pStyle", Type);
        Styles newType = (Styles)tq.getSingleResult();
        int id=newType.getStyleId();
        return id;
        
    }
}
