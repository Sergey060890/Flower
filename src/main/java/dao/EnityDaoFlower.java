package dao;

import entity.Flower;
import util.HibernateUtil;

public class EnityDaoFlower extends EntityDaoImpl<Flower> implements FlowerDao {
    public EnityDaoFlower() {
        super(Flower.class, HibernateUtil.getEntityManager());
    }
}
