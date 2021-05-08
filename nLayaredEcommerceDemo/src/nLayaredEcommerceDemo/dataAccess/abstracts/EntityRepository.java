package nLayaredEcommerceDemo.dataAccess.abstracts;


import java.util.List;

import nLayaredEcommerceDemo.entities.abstracts.Entity;

public interface EntityRepository<Entity> {
	void add(Entity entity);
	void update(Entity entity);
	void delete(Entity entity);
	List<Entity> getAll();
	Entity getId(int id);
}
