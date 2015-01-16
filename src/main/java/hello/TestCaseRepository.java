package hello;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "testcases", path = "testcases")
public interface TestCaseRepository extends PagingAndSortingRepository<TestCase, String> {

}