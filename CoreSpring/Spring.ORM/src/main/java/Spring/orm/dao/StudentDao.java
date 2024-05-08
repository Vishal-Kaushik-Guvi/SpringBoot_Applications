package Spring.orm.dao;

import org.springframework.orm.hibernate.HibernateTemplate;

import Sprin.orm.Entities.Student;
import jakarta.transaction.Transactional;

public class StudentDao {
	
	private HibernateTemplate temp;
	@Transactional
  public int insert(Student std) {
	  int i = (int) this.temp.save(std);
	  return i;
  }
}
