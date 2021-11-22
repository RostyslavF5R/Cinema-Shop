package cinema.shop.dao.impl;

import cinema.shop.dao.AbstractDao;
import cinema.shop.dao.RoleDao;
import cinema.shop.exception.DataProcessingException;
import cinema.shop.model.Role;
import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {

    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Optional<Role> getRoleByName(String name) {
        try (Session session = factory.openSession()) {
            Query<Role> findByName = session.createQuery("FROM Role "
                    + "WHERE name = :name", Role.class);
            findByName.setParameter("name", name);
            return findByName.uniqueResultOptional();
        } catch (Exception e) {
            throw new DataProcessingException("Cannot get role by name: " + name, e);
        }
    }
}
