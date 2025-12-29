package studentdatabase;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="student")

public interface StudentRepository extends JpaRepository<Student, Long>{

	List<Student> findByDept(String dept);
	
}
