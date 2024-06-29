package com.mue.music.model_test_ui.abs;

public abstract class BaseSqliteModel {
    protected long id;
    protected String name;

    public BaseSqliteModel() {
    }

    public BaseSqliteModel(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
