package dao.custom;

import entity.Course;
import entity.Registration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

import java.sql.SQLException;

public interface RegisterDAO {
    public boolean add(Registration registration) throws SQLException, ClassNotFoundException;
    public Course getCourseByStudent(String nic) throws Exception;
}
