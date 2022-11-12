package com.web.api.model;

import javax.persistence.*;

@Entity
@Table(name = "applications")
public class Applications {
    private int id;
    private int category;
    private String name;
    private String description;
    private String download;
    private String silent_install_cmd;
    private int status;
    private String icon;

    public Applications() {
    }

    public Applications(int id, int category, String name, String description, String download, String silent_install_cmd, int status, String icon) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.description = description;
        this.download = download;
        this.silent_install_cmd = silent_install_cmd;
        this.status = status;
        this.icon = icon;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getCategory() {
        return category;
    }
    public void setCategory(int category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDownload() {
        return download;
    }
    public void setDownload(String download) {
        this.download = download;
    }

    public String getSilent_install_cmd() {
        return silent_install_cmd;
    }
    public void setSilent_install_cmd(String silent_install_cmd) {
        this.silent_install_cmd = silent_install_cmd;
    }

    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }

    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
}
