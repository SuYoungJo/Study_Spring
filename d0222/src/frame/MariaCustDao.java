package frame;

import org.springframework.stereotype.Repository;

@Repository("mcdao")
public class MariaCustDao implements Dao {

	@Override
	public void insert() {
		System.out.println("Maria Cust Dao Inserted ...");
	}

	@Override
	public void delete() {
		System.out.println("Maria Cust Dao Deleted ...");

	}

	@Override
	public void update() {
		System.out.println("Maria Cust Dao Updated ...");

	}

}
