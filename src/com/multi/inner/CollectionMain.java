package com.multi.inner;

public class CollectionMain {

    private int x;
    private CollectionEx collectionEx=new CollectionEx() {
        @Override
        public void add() {

        }

        @Override
        public void remove() {

        }

        @Override
        public void empty() {

        }
    };
    public CollectionMain(){
        new CollectionEx(){
            @Override
            public void add() {
                x=100;
                System.out.println("add="+x);
            }
            @Override
            public void remove() {
            }
            @Override
            public void empty() {

            }
        }.add();
    }
    public static void main(String[] args) {
        CollectionMain cm=new CollectionMain();
    }
}
