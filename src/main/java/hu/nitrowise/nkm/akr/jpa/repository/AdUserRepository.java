package hu.nitrowise.nkm.akr.jpa.repository;

import hu.nitrowise.nkm.akr.jpa.model.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdUserRepository extends JpaRepository<AdUser, Long> {

}
