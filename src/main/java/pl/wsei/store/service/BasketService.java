package pl.wsei.store.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Persistence;
import pl.wsei.store.model.Basket;

import java.util.List;
import java.util.Objects;

public class BasketService {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");




    public void buyItem(String item, int quantity) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();

            Basket foundBasket = null;
            try {
                foundBasket = em.createQuery("SELECT b FROM Basket b WHERE b.item = :item", Basket.class)
                        .setParameter("item", item)
                        .getSingleResult();
            } catch (NoResultException e) {
                // No existing basket found; proceed with creating a new one
            }

            if (foundBasket != null) {
                // Update quantity of existing basket item
                foundBasket.setQuantity(foundBasket.getQuantity() + quantity);
                em.merge(foundBasket);
            } else {
                // No existing item, so create a new one
                Basket newBasket = new Basket();
                newBasket.setItem(item);
                newBasket.setQuantity(quantity);
                em.persist(newBasket);
            }

            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }


    public List<Basket> getAllItems() {
        EntityManager em = emf.createEntityManager();
        List<Basket> items;
        try {
            items = em.createQuery("SELECT b FROM Basket b", Basket.class).getResultList();
        } finally {
            em.close();
        }
        return items;
    }

    public void emptyBasket() {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.createQuery("DELETE FROM Basket").executeUpdate();
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

}
