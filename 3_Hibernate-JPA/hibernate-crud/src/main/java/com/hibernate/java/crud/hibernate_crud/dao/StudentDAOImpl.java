package com.hibernate.java.crud.hibernate_crud.dao;

import com.hibernate.java.crud.hibernate_crud.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository // sub-annotation of @Component annotation --> needed for component scanning
public class StudentDAOImpl implements StudentDAO {

    //def field for entity manager
    private EntityManager entityManager;

    //we'll inject the entityManage with constructor Injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //implement save method
    @Override
    @Transactional  // So spring handles all the actions/transactions going with DB by itself
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }


}
