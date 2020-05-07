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
        List listTenique= new ArrayList();
        List listMarket = new ArrayList();
        Map Allmap = new HashMap();
        for(int i = 0; i < users.size(); i++){
            System.out.println(users.get(i));
            Map map = new HashMap();
            map.put("department", users.get(i).getDepartment());
            map.put("name", users.get(i).getName());
            map.put("age", users.get(i).getAge());
            if(users.get(i).getDepartment() == "技术部") {
                listTenique.add(map);
            } else if(users.get(i).getDepartment() == "市场部") {
                listMarket.add(map);
            }
        }
        Allmap.put("技术部", listTenique);
        Allmap.put("市场部", listMarket);
        return Allmap;
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
