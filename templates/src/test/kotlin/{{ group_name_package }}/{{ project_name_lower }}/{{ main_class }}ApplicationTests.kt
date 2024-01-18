package {{ project_base_package }}

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@SpringBootTest
@ActiveProfiles("test")
class {{ main_class }}ApplicationTests {

	@Test
	fun contextLoads() {
	}

}
