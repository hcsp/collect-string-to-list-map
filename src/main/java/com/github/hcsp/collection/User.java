package com.github.hcsp.collection;

import java.util.*;

public class User implements List<User> {
    // 用户的id
    private final Integer id;
    // 用户的姓名
    private final String name;
    // 用户的年龄
    private final int age;
    // 用户的部门，例如"技术部"/"市场部"
    private final String department;

    public User(Integer id, String name, int age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
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
    public Iterator<User> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    @Override
    public boolean add(User user) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends User> collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, Collection<? extends User> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User person = (User) o;
        return Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public User get(int i) {
        return null;
    }

    @Override
    public User set(int i, User user) {
        return null;
    }

    @Override
    public void add(int i, User user) {

    }

    @Override
    public User remove(int i) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<User> listIterator() {
        return null;
    }

    @Override
    public ListIterator<User> listIterator(int i) {
        return null;
    }

    @Override
    public List<User> subList(int i, int i1) {
        return null;
    }
}
