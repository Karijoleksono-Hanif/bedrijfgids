package sr.unasat.bedrijfgids.repository;

import sr.unasat.bedrijfgids.entity.Filialen;
import jakarta.persistence.EntityManager;

public class FilialenRepository {

    private EntityManager entityManager;

    public  FilialenRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Filialen createFilialen(Filialen filialen) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(filialen);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return filialen;
    }

}


