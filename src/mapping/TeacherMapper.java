package mapping;

import java.util.List;

import pojo.TeacherCourse;

public interface TeacherMapper {
	public int insert(TeacherCourse course);       //插入对象
	public TeacherCourse find(int id);              //查询对象
	
	//
	public int delete(int id);                     //删除对象
	public void update(TeacherCourse course);       //修改对象
	public TeacherCourse selectUserById(int id);    //查询对象
	public List<TeacherCourse> selectAllUser();           //全表查询
}
