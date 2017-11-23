/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBpackage;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author benmc
 */
public class DButil {
        private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("RealtyPU");
public static EntityManagerFactory getEmf(){
return emf;
}
}
