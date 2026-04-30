package com.multi.lambda;
class User {
    String name; // 사용자 이름 필드

    public User(String name) {
        this.name=name;
    }
}
@FunctionalInterface
interface Creator {
    User create(String name); // 문자열을 받아 User 객체를 생성하는 추상 메소드
}

public class LambdaEx9 {
    public static void main(String[] args) {
        //
        Creator c1=(name)->new User(name);
        Creator c2=User::new;
    }
}
