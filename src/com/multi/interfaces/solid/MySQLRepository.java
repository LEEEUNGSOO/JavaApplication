package com.multi.interfaces.solid;

public class MySQLRepository implements UserRepository {
    @Override
    public void save(String data) {
        System.out.println("MySql 저장"+data);

    }
}
