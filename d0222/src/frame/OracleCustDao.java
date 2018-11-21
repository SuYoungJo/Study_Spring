package frame;

import org.springframework.stereotype.Repository;

@Repository("ocdao")
public class OracleCustDao implements Dao {

	@Override
	public void insert() {
		System.out.println("Oracle Cust Dao Inserted ...");
	}

	@Override
	public void delete() {
		System.out.println("Oracle Cust Dao Deleted ...");

	}

	@Override
	public void update() {
		System.out.println("Oracle Cust Dao Updated ...");

	}

}
