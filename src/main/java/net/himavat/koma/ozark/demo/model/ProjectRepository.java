package net.himavat.koma.ozark.demo.model;

import java.util.List;

/**
 * A project repo for Java MVC demo.
 */
public interface ProjectRepository {
    List<Project> findAll();

    void save(Project project);

    void delete(Integer id);

    Project get(Integer id);
}
