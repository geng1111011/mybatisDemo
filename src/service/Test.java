package service;



import org.apache.ibatis.session.SqlSession;
import pojo.TeacherCourse;
import tool.DBTools;
import mapping.TeacherMapper;

public class Test {

	public static void main(String[] args) {
		insert();
	}


private static void insert() {
        SqlSession session = DBTools.getSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        TeacherCourse teacherCourse = new TeacherCourse(6,"сОнд©н",3);
         try {
            mapper.insert(teacherCourse);
            System.out.println(teacherCourse.toString());
            session.commit();
        } catch (Exception e) {
        	e.printStackTrace();
            session.rollback();
        }
    }}