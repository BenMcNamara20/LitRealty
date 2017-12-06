/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBpackage;

import Entities.Properties;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

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
    public static ArrayList getPropByAgentID(int ID){
        EntityManager em = DButil.getEmf().createEntityManager();
        TypedQuery tq = em.createNamedQuery("Properties.findByAgentId", Properties.class);
        tq.setParameter("agentId", ID);
        ArrayList propertyList=(ArrayList) tq.getResultList();
        return propertyList;
        
        
    }
            
    
    
}
