package model.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("java-explorer-jpa");
	EntityManager em = emf.createEntityManager();

}
