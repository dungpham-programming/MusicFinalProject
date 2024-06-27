package com.ltmobile.music.model.abs;

public abstract class BaseApiModel {
    protected String id;
    protected String name;

    public String getId() {
        return id;
    }

    public BaseApiModel() {
    }

    public BaseApiModel(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
