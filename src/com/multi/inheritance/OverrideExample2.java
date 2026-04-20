package com.multi.inheritance;
//OverrideExample2는 Object이다
public class OverrideExample2 extends  Object{

    public void method(){
        System.out.println(this.toString());

    }

    @Override
    public String toString() {
        return super.toString()+" 안녕 난 toString";
    }

    public static void main(String[] args) {
        OverrideExample2 o=new OverrideExample2();
        o.method();

    }


}
