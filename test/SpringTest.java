
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chensong.bean.Student;
import com.chensong.service.StudentService;


public class SpringTest {
	
	public static void main(String[] args) {
		//springTransactionTest();
		springAopTest();
	}
	
	//�������
	public static void springTransactionTest(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService studentService = (StudentService) ctx.getBean("studentService");
		Student student = (Student) ctx.getBean("student");
		studentService.addStudent(student);
	}
	
	//aop֪ͨ����
	public static void springAopTest(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService studentService = (StudentService) ctx.getBean("studentService");
		Student student = (Student) ctx.getBean("student");
		studentService.addStudent(student);
		studentService.delStudentByNo(12);
	}
}
