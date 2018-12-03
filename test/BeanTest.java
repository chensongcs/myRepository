
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chensong.bean.AllCollectionType;
import com.chensong.bean.Course;
import com.chensong.bean.User;


public class BeanTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User) ctx.getBean("user");
		User user2 = (User) ctx.getBean("user");
		System.out.println(user);
		System.out.println(user2);
		
		Course course = (Course) ctx.getBean("course");
		course.showInfo();
		
		AllCollectionType collectionType= (AllCollectionType) ctx.getBean("collectionDemo");
		System.out.println(collectionType.toString());
	}
}
