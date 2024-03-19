package co.edu.uptc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@SpringBootApplication
public class DemoApplication {

	private List<City> cities = new ArrayList<>();
	private List<Person> persons = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/ciudades/{codigo}")
	public City getCity(@PathVariable String codigo) {
		return cities.stream()
				.filter(city -> city.getDaneCode().equals(codigo))
				.findFirst()
				.orElseThrow(() -> new NotFoundException("Ciudad no encontrada"));
	}

	@GetMapping("/ciudades")
	public List<City> getAllCities() {
		return cities;
	}

	@PostMapping("/ciudades")
	public String addCity(@RequestBody City city) {
		cities.add(city);
		return "Ciudad agregada exitosamente";
	}

	@GetMapping("/personas/{estructura}")
	public Person getPerson(@PathVariable String estructura) {
		return persons.stream()
				.filter(person -> person.getNameClient().equals(estructura))
				.findFirst()
				.orElseThrow(() -> new NotFoundException("Persona no encontrada"));
	}

	@GetMapping("/personas")
	public List<Person> getAllPersons() {
		return persons;
	}

	@PostMapping("/personas")
	public String addPerson(@RequestBody Person person) {
		// Asegúrate de establecer la ciudad en la que nació la persona
		String bornIn = person.getBornIn();
		if (cities.stream().noneMatch(city -> city.getDaneCode().equals(bornIn))) {
			throw new NotFoundException("La ciudad de nacimiento no está registrada.");
		}
		persons.add(person);
		return "Persona agregada exitosamente";
	}

	@GetMapping("/personas/nacidas-en/{ciudad}")
	public List<Person> getPersonsByCity(@PathVariable String ciudad) {
		return persons.stream()
				.filter(person -> person.getBornIn().equals(ciudad)) //
				.collect(Collectors.toList());
	}
	@PostMapping("/personas/{nombre}/{apellido}/{fecha}/{ciudad}/{numero}/{cliente}")
	public String addPersonByUrl(@PathVariable String nombre, @PathVariable String apellido,
								 @PathVariable String fecha, @PathVariable String ciudad,
								 @PathVariable int numero, @PathVariable String cliente) {
		// Aquí creas la persona utilizando los parámetros recibidos
		Person person = new Person(nombre, apellido, fecha, ciudad, numero, cliente);
		// Luego agregas la persona a tu lista o a tu repositorio de datos
		persons.add(person);
		return "Persona agregada exitosamente";
	}
	@ResponseStatus
	class NotFoundException extends RuntimeException {
		NotFoundException(String message) {
			super(message);
		}
	}
}
