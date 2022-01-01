package dao.custom.impl;

import dao.custom.RegisterDAO;
import entity.Course;
import entity.Registration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.FactoryConfiguration;

import java.sql.SQLException;
import java.util.List;

public class RegisterDAOImpl implements RegisterDAO {

    @Override
    public boolean add(Registration registration) throws SQLException, ClassNotFoundException {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(registration);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public Course getCourseByStudent(String nic) throws Exception {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.createQuery("SELECT courses_PID FROM registration_course WHERE registrationList_regNo = : SID");
        //query.setParameter("SID", nic);
        /*List<Course> list = query.list();
        for (Course course : list) {
            transaction.commit();
            session.close();
            return course;
        }*/
        transaction.commit();
        session.close();
        return null;
    }
}
