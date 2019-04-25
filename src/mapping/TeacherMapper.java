package mapping;

import java.util.List;

import pojo.TeacherCourse;

public interface TeacherMapper {
	public int insert(TeacherCourse course);       //�������
	public TeacherCourse find(int id);              //��ѯ����
	
	//
	public int delete(int id);                     //ɾ������
	public void update(TeacherCourse course);       //�޸Ķ���
	public TeacherCourse selectUserById(int id);    //��ѯ����
	public List<TeacherCourse> selectAllUser();           //ȫ���ѯ
}
