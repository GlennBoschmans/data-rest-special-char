package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories
@Import(TestCaseRepositoryRestConfiguration.class)
@EnableAutoConfiguration
@EnableTransactionManagement
@ComponentScan
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class);
		TestCaseRepository repo = context.getBean(TestCaseRepository.class);
		
		repo.save(new TestCase("3§1A","look at my wrong self link"));
		repo.save(new TestCase("ç","I have the same issue"));
		repo.save(new TestCase("OK", "no issue here"));
	}
}