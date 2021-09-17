package pe.popehiflo.bookstorebackend;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pe.popehiflo.bookstorebackend.model.Categoria;
import pe.popehiflo.bookstorebackend.model.Libro;
import pe.popehiflo.bookstorebackend.repository.CategoriaRepository;
import pe.popehiflo.bookstorebackend.repository.LibroRepository;

@SpringBootApplication
public class BookstoreBackendApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LibroRepository libroRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(BookstoreBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(null, "Informatica", "TI");
		
		Libro lib1 = new Libro(null, "Libro de popehilo", "popehiflo", "creado por popehiflo", cat1);
		
		cat1.getLibros().addAll(Arrays.asList(lib1));
		
		this.categoriaRepository.save(cat1);
		this.libroRepository.save(lib1);
	}

}
