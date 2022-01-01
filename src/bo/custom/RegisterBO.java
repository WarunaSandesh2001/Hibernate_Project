package bo.custom;

import dto.RegisterDTO;
import entity.Course;

public interface RegisterBO {
    public boolean registerStudent(RegisterDTO dto) throws Exception;
    public Course getCourseByStudent(String sID) throws Exception;;
}
