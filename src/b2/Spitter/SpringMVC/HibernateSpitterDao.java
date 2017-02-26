package b2.Spitter.SpringMVC;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateSpitterDao implements SpitterDao {
	
	private SessionFactory sessionFactory;
	
	@Autowired
	public HibernateSpitterDao() {
		// TODO Auto-generated constructor stub
	}

}
