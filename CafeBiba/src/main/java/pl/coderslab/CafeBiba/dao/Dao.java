package pl.coderslab.CafeBiba.dao;

import pl.coderslab.CafeBiba.entity.EntityModel;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
abstract public class Dao<T extends EntityModel> {

    @PersistenceContext
    EntityManager entityManager;

    private Class<T> type;


    public void save(T entity){
        if(entity.getId() == null){
            entityManager.persist(entity);
        }else{
            entityManager.merge(entity);
        }
    }

    public T findById(Long id){
        return entityManager.find(type, id);
    }

    public boolean deleteById(Long id){
        T entity = findById(id);
        if(entity != null) {
            entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
            return true;
        }
        return false;
    }

}