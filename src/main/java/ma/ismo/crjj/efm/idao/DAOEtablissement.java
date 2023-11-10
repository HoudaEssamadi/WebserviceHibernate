package ma.ismo.crjj.efm.idao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import ma.ismo.crjj.efm.model.Etablissement;
import ma.ismo.crjj.efm.utils.HibernateUtils;

public class DAOEtablissement implements IDAO<Etablissement> {

	@Override
	public List<Etablissement> getAll() {
		Session s = HibernateUtils.getSessionfactory().getCurrentSession();
		Transaction t = s.beginTransaction();

		List<Etablissement> etabs = s.createQuery("from Etablissement").list();

		t.commit();
		s.close();

		return etabs;
	}

	@Override
	public Etablissement getOne(int id) {
		try (Session session = HibernateUtils.getSessionfactory().getCurrentSession()) {
			return session.get(Etablissement.class, id);
		}
	}

	@Override
	public boolean save(Etablissement obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Etablissement obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Etablissement obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
