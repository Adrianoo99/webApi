package com.web.api.model;

import javax.persistence.*;

@Entity
@Table(name = "configs")
public class Configs {
    private int id;
    private int user_id;
    private String name;
    private String config;
    private int is_public;
    private String create_date;
    private int status;

    public Configs() {
    }

    public Configs(int id, int user_id, String name, String config, int is_public, String create_date, int status) {
        this.id = id;
        this.user_id = user_id;
        this.name = name;
        this.config = config;
        this.is_public = is_public;
        this.create_date = create_date;
        this.status = status;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getConfig() {
        return config;
    }
    public void setConfig(String config) {
        this.config = config;
    }



}
