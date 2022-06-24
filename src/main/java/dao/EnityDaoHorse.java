package dao;

import entity.Horse;
import util.HibernateUtil;

public class EnityDaoHorse extends EntityDaoImpl<Horse> implements HorseDao {
    public EnityDaoHorse() {
        super(Horse.class, HibernateUtil.getEntityManager());
    }
}
