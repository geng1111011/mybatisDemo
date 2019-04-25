package pojo;

import java.io.Serializable;

public class TeacherCourse implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int teacherId;        //��ʦID��
	private String courseName;    //���ڿγ�
	private int amount;           //ѡ������
	
	public TeacherCourse() {
		super();
	}
	public TeacherCourse(int teacherId, String courseName, int amount) {
		super();
		this.teacherId=teacherId;
		this.courseName=courseName;
		this.amount=amount;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "TeacherCourse [teacherId=" + teacherId + ", courseName=" + courseName + ", amount=" + amount + "]";
	}
}
