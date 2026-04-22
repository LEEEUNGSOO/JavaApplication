package com.multi.inner;

public class StaticOuter {
    private int outerStatic;
    public void outerMethod(){
    //private int staticValue;error;
    //static int sValue;
    }
    public static class StaticInner{
        private static int innerValue;
        public  StaticInner(){
            //outerStatic=100; staticInnerClass는 외부에클래스에 인스턴스로 접근 불가합니다
        }

    }

    public static void main(String[] args) {
        new StaticOuter.StaticInner();
    }
}
