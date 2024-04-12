package constraint;

import java.util.List;

public interface CRUD<T, K> {
	List<T> findAll();

	boolean save(T entity);

	boolean update(T entity);

	boolean removebyId(K id);

	T findById(K id);
}
