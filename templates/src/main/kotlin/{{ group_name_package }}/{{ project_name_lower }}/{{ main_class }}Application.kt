package {{ project_base_package }}

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class {{ main_class }}Application

fun main(args: Array<String>) {
	runApplication<{{ main_class }}Application>(*args)
}
