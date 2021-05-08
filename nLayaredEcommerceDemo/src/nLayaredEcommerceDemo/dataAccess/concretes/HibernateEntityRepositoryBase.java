package nLayaredEcommerceDemo.dataAccess.concretes;


import java.util.List;

import nLayaredEcommerceDemo.dataAccess.abstracts.EntityRepository;
import nLayaredEcommerceDemo.entities.abstracts.Entity;

public class HibernateEntityRepositoryBase<Entity> implements EntityRepository<Entity> {

	@Override
	public void add(Entity entity) {
		System.out.println("Hibernate ile eklendi ");
		
	}

	@Override
	public void update(Entity entity) {
		System.out.println("Hibernate ile güncellendi ");
		
	}

	@Override
	public void delete(Entity entity) {
		System.out.println("Hibernate ile silindi ");
		
	}

	@Override
	public List<Entity> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entity getId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
