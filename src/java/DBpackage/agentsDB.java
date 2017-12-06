/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBpackage;

import Entities.Agents;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author benmc
 */
public class agentsDB {
     public static boolean Login(String Username , String Password){
         try{
         EntityManager emf =DButil.getEmf().createEntityManager();
         TypedQuery usernameQuery =emf.createNamedQuery("Agents.findByUsername", Agents.class);
         usernameQuery.setParameter("username", Username);
         Agents agentUser=(Agents) usernameQuery.getSingleResult();
         if(agentUser.getPassword().equals(Password)){
             return true;
         }
         else
             return false;
         }
         catch(Exception e){
             e.printStackTrace();
             return false;
         }
    }
     public static int getID(String Username){
         EntityManager emf = DButil.getEmf().createEntityManager();
         TypedQuery getImage = emf.createNamedQuery("Agents.getAgentID", Agents.class);
         getImage.setParameter("username", Username);
         System.out.println(Username);
         int AgentImage=(int)getImage.getSingleResult();
         return AgentImage;
     }
}
