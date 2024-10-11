package pl.wsei.store.service;

import jakarta.mail.FetchProfile;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pl.wsei.store.model.Bucket;

public class BucketService {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistance_unit");
    private EntityManager em = emf.createEntityManager();

    public void buyItem(String item) {
        em.getTransaction().begin();

        Bucket bucket = new Bucket();
        bucket.setItem(item);
        em.persist(bucket);

        em.getTransaction().commit();
    }
}
