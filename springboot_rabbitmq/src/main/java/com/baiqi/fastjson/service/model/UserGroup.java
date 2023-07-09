package com.baiqi.fastjson.service.model;

import java.util.ArrayList;
import java.util.List;

/**
 * UserGroup
 */
public class UserGroup {
    private String name;
    private List<User> users = new ArrayList<User>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public UserGroup(String name, List<User> users) {
        this.name = name;
        this.users = users;
    }



    public UserGroup() {
    }

    @Override
    public String toString() {
        return "UserGroup{" +
                "name='" + name + '\'' +
                ", users=" + users +
                '}';
    }



}
