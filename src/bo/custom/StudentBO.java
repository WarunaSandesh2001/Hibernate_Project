package bo.custom;

import dto.StudentDTO;

public interface StudentBO {
    public boolean saveStudent(StudentDTO dto) throws Exception;
    public String newStudentID() throws Exception;
}
