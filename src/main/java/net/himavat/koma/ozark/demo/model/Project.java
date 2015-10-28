package net.himavat.koma.ozark.demo.model;

import javax.ws.rs.FormParam;

/**
 * Created by koma on 27.10.15.
 */
public class Project {

    @FormParam("id")
    private Integer id;

    @FormParam("name")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
