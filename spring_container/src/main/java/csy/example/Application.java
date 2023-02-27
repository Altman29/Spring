package csy.example;

import csy.example.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        //1.加载类路径下的配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        //2.从文件系统下 加载配置文件，使用绝对路径
        // ApplicationContext ctx = new FileSystemXmlApplicationContext("/Users/edy/code/spring/spring_container/src/main/resources/application.xml");
        // BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        // BookDao bookDao = ctx.getBean("bookDao", BookDao.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        bookDao.save();
    }
}
