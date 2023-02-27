package csy.example.dao.impl;

import csy.example.dao.BookDao;
import org.springframework.stereotype.Component;

/**
 * <bean id="bookDao" class="csy.example.dao.impl.BookDaoImpl"/>
 * 使用注解代替
 */

@Component("bookDao")
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao save...");
    }
}
