package fr.inti.rdvmedecins.crud;

import org.springframework.data.repository.CrudRepository;

import fr.inti.rdvmedecins.jpa.Rv;

public interface RvRepository extends CrudRepository<Rv, Long> {

}
