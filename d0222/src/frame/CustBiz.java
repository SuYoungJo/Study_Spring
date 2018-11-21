/**
 * 
 */
package frame;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cbiz")
public class CustBiz implements Biz {
	
	@Resource(name="ocdao")
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
