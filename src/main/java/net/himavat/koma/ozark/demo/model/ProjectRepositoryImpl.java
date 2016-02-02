package net.himavat.koma.ozark.demo.model;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.inject.Singleton;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * A project repo dummy implementation.
 */
@ApplicationScoped
@Default
public class ProjectRepositoryImpl implements ProjectRepository {

    private List<Project> projects = new CopyOnWriteArrayList<>();

    @Override
    public List<Project> findAll() {
        return projects;
    }

    @Override
    public void save(Project project) {
        if (project.getId() != null && project.getId() <= projects.size()) {
            projects.get(project.getId() - 1).setName(project.getName());
        } else {
            projects.add(project);
            project.setId(projects.size());
        }
    }

    @Override
    public void delete(Integer id) {
        projects.remove(id - 1);
    }

    @Override
    public Project get(Integer id) {
        return projects.get(id - 1);
    }

}
