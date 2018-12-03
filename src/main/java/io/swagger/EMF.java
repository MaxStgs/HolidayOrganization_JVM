package io.swagger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMF {

    private static EntityManager em;

    public static EntityManager getEm() {
        return em;
    }

    EMF() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("UnitPersistence");
        em = emf.createEntityManager();
    }
}
