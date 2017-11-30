/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBpackage;

import Entities.Properties;
import javax.persistence.EntityManager;

/**
 *
 * @author benmc
 */
public class propertiesDB {
    public static void addPropToDB(Properties newProp){
        EntityManager em = DButil.getEmf().createEntityManager();
        em.getTransaction().begin();
        em.persist(newProp);
        em.getTransaction().commit();
        
    }
}
