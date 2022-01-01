package bo.custom.Impl;

import bo.custom.RegisterBO;
import dao.custom.RegisterDAO;
import dao.custom.impl.RegisterDAOImpl;
import dto.CourseDTO;
import dto.RegisterDTO;
import entity.Course;
import entity.Registration;

public class RegisterBOImpl implements RegisterBO {
    RegisterDAO registerDAO = new RegisterDAOImpl();

    @Override
    public boolean registerStudent(RegisterDTO dto) throws Exception {
        return registerDAO.add(new Registration(dto.getRegNo(),dto.getRegDate(),dto.getFee(),dto.getStudent(),dto.getCourses()));
    }

    @Override
    public Course getCourseByStudent(String sID) throws Exception {
        return registerDAO.getCourseByStudent(sID);
    }
}
