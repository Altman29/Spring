package csy.example.dao.impl;

import csy.example.dao.BookDao;

public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
