package br.com.rasmoo.restaurante.service;

import br.com.rasmoo.restaurante.entity.Prato;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class PratoService {
    public static void main(String[] args) {
        Prato rizzotto = new Prato();
        rizzotto.setNome("Rizzotto de frutos do mar");
        rizzotto.setDescricao("Rizzotto acompanhado de lula, polvo e mariscos");
        rizzotto.setDisponivel(Boolean.TRUE);
        rizzotto.setValor(BigDecimal.valueOf(88.50));

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rasfood");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(rizzotto);
        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
