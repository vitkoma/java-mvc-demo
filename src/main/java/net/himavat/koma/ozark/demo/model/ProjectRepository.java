package net.himavat.koma.ozark.demo.model;

import java.util.List;

/**
 * Created by koma on 28.10.15.
 */
public interface ProjectRepository {
    List<Project> findAll();

    void save(Project project);

    void delete(Integer id);

    Project get(Integer id);
}
