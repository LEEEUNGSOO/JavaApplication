package com.multi.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CollectionEx1 implements Collection {
    @Override
    public Object[] toArray(IntFunction generator) {
        return Collection.super.toArray(generator);
    }

    @Override
    public boolean removeIf(Predicate filter) {
        return Collection.super.removeIf(filter);
    }

    @Override
    public Spliterator spliterator() {
        return Collection.super.spliterator();
    }

    @Override
    public Stream stream() {
        return Collection.super.stream();
    }

    @Override
    public Stream parallelStream() {
        return Collection.super.parallelStream();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
