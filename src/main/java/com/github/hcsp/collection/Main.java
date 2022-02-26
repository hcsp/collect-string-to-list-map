package com.github.hcsp.collection;

import java.util.*;

public class Main {
    // 请编写一个方法，对传入的List<User>进行如下处理：
    // 返回一个从部门名到这个部门的所有用户的映射。同一个部门的用户按照年龄进行从小到大排序。
    // 例如，传入的users是[{name=张三, department=技术部, age=40 }, {name=李四, department=技术部, age=30 },
    // {name=王五, department=市场部, age=40 }]
    // 返回如下映射：
    //    技术部 -> [{name=李四, department=技术部, age=30 }, {name=张三, department=技术部, age=40 }]
    //    市场部 -> [{name=王五, department=市场部, age=40 }]
    public static Map<String, List<User>> collect(List<User> users) {
        HashMap<String, List<User>> result = new HashMap<>();
        for (User user: users) {
            String department = user.getDepartment();
            if (result.containsKey(department)) {
                List<User> departmentUsers = result.get(department);
                departmentUsers.add(user);
            } else {
                ArrayList<User> departmentUsers = new ArrayList<>();
                departmentUsers.add(user);
                result.put(department, departmentUsers);
            }
        }
        for (List<User> departmentUsers:
             result.values()) {
            departmentUsers.sort(new Comparator<User>() {
                @Override
                public int compare(User o1, User o2) {
                    if (o1.getAge() < o2.getAge()) {
                        return -1;
                    } else if (o1.getAge() > o2.getAge()) {
                        return 1;
                    }
                    return 0;
                }
            });
        }
        return result;
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
