package cs.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cs.bean.Stud;
public class Springmain {
	 public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("cs/config/app.xml");
		 Stud s = (Stud) context.getBean("s1");
		 s.display();
	 }

}
