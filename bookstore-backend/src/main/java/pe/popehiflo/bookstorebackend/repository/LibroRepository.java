package pe.popehiflo.bookstorebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.popehiflo.bookstorebackend.model.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {

}
