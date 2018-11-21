/**
 * 
 */
package frame;

/**
 * @author student
 *
 */
public class CustBiz implements Biz {

	Dao dao;
	
	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	@Override
	public void register() {
		dao.insert();
	}

	/* (non-Javadoc)
	 * @see frame.Biz#remove()
	 */
	@Override
	public void remove() {
		dao.delete();
	}

	/* (non-Javadoc)
	 * @see frame.Biz#modify()
	 */
	@Override
	public void modify() {
		dao.update();
	}

}
