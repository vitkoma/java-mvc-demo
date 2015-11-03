package net.himavat.koma.ozark.demo;

import net.himavat.koma.ozark.demo.model.Project;
import net.himavat.koma.ozark.demo.model.ProjectRepository;
import net.himavat.koma.ozark.demo.model.ProjectRepositoryImpl;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.ws.rs.*;

/**
 * Created by koma on 27.10.15.
 */
@Controller
@Path("projects")
public class ProjectController {

    @Inject
    Models models;

    @Inject
    ProjectRepository projectRepository;

    @GET
    public String list() {
        models.put("projects", projectRepository.findAll());
        return "projects.jsp";
    }

    @GET
    @Path("/new")
    public String showCreate() {
        return "editProject.jsp";
    }

    @POST
    @Path("/new")
    public String create(@BeanParam Project project) {
        projectRepository.save(project);
        return "redirect:projects";
    }

    @GET
    @Path("/{id}")
    public String get(@PathParam("id") Integer id) {
        models.put("project", projectRepository.get(id));
        return "editProject.jsp";
    }

    @POST
    @Path("/{id}")
    public String update(@BeanParam Project project) {
        projectRepository.save(project);
        return list();
    }

    @GET
    @Path("/{id}/remove")
    public String delete(@PathParam("id") Integer id) {
        projectRepository.delete(id);
        return "redirect:projects";
    }

}
