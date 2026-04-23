package com.multi.base.module;

public class StringEx {
    private char []value;
    public StringEx(){

    }
    public StringEx(char []value){
        this.value=value;
    }
    public char charAt(int index){
        if(index<0|| index >value.length-1)
            throw new StringIndexOutOfBoundsException();
        return value[index];
    }
    public boolean equals(Object obj){
        if(this ==obj)return true;
        if(obj instanceof String){
            char []temp=((String)(obj)).toCharArray();
            if(temp.length!=value.length)return false;
            for (int i = 0; i <this.value.length ; i++) {
                if(value[i]!=temp[i])return false;
            }//for
            return  true;
        }
        return false;
    }

    public static void main(String[] args) {
        StringEx str1=new StringEx("abc".toCharArray());//  value[a][b][c]
        StringEx str2=new StringEx("def".toCharArray());//  value[d][e][f]
        //System.out.println( str1.equals("abc"));
        System.out.println(str2.charAt(-1));

    }

}
