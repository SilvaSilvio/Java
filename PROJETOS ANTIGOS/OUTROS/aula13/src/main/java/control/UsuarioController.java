package control;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.BackendFrontend;
import model.Usuario;

@RestController
@CrossOrigin(origins = "*")
class UsuarioController extends GenericController<Usuario> {
	private static final String URL = "/usuario";

	public UsuarioController() {
		super(Usuario.class);
	}

	@GetMapping(URL)
	BackendFrontend findAll() {
		return super.findAll();
	}

	@GetMapping(URL + "/{id}")
	public BackendFrontend findById(@PathVariable Long id) {
		return super.findById(id);
	}

	@PostMapping(URL)
	public BackendFrontend save(@RequestBody Usuario entity) {
		return super.save(entity);
	}

	@PutMapping(URL)
	public BackendFrontend update(@RequestBody Usuario entity) {
		return super.update(entity);
	}

	@DeleteMapping(URL + "/{id}")
	public BackendFrontend remove(@PathVariable Long id) {
		return super.remove(id);
	}
}
