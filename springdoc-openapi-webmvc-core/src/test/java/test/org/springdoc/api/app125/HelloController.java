package test.org.springdoc.api.app125;

import javax.validation.constraints.NotNull;

import org.springdoc.api.annotations.ParameterObject;

import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bnasslahsen
 */
@RestController
public class HelloController {

	@GetMapping(value = "/search", produces = { "application/xml", "application/json" })
	public DeprecatedEntity getAllPets(@NotNull String toto) {
		return null;
	}

	@GetMapping(value = "/search2", produces = { "application/xml", "application/json" })
	public void getAllPets2(@ParameterObject Pageable pageable) {
	}
}
