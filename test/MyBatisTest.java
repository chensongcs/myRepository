import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chensong.bean.Student;
import com.chensong.service.StudentService;


public class MyBatisTest {
	public static void main(String[] args) {
		myBatisTest();
	}
	
	private static void myBatisTest(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService studentService = (StudentService) ctx.getBean("studentService");
		Student student = new Student();
		student.setStuNo(1);
		student.setStuName("chensong");
		student.setStuAge(27);
		student.setAddress("�й��Ϻ��ֶ�");
		student.setSex("��");
		studentService.addStudent2(student);
	}
}
