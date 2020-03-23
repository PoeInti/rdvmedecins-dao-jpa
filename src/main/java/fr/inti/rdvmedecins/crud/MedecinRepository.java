package fr.inti.rdvmedecins.crud;

import org.springframework.data.repository.CrudRepository;

import fr.inti.rdvmedecins.jpa.Medecin;

public interface MedecinRepository extends CrudRepository<Medecin, Long> {

}
