package fr.inti.rdvmedecins.crud;

import org.springframework.data.repository.CrudRepository;

import fr.inti.rdvmedecins.jpa.Client;



public interface ClientRepository extends CrudRepository<Client, Long>{

}
