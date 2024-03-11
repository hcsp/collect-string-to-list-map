package com.github.hcsp.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static Map<String, List<User>> collect(List<User> users) {
        Map<String, List<User>> map = new HashMap<>();
        users.stream()
                .sorted(Comparator.comparing(User::getDepartment).thenComparing(User::getAge))
                .forEachOrdered(user -> map.computeIfAbsent(user.getDepartment(), d -> new ArrayList<>()).add(user));
        return map;
    }

    public static void main(String[] args) {
        System.out.println(
                collect(
                        Arrays.asList(
                                new User(1, "张三", 40, "技术部"),
                                new User(2, "李四", 30, "技术部"),
                                new User(3, "王五", 40, "市场部"))));
    }
}
