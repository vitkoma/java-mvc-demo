package net.himavat.koma.ozark.demo;

import net.himavat.koma.ozark.demo.model.Project;
import net.himavat.koma.ozark.demo.model.ProjectRepository;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.ws.rs.*;

/**
 * JEE MVC demo controller.
 */
@Controller @Path("projects")
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

    @Path("/new") @GET
    public String showCreate() {
        return "editProject.jsp";
    }

    @Path("/new") @POST
    public String create(@BeanParam Project project) {
        projectRepository.save(project);
        return "redirect:projects";
    }

    @Path("/{id}") @GET
    public String get(@PathParam("id") Integer id) {
        models.put("project", projectRepository.get(id));
        return "editProject.jsp";
    }

    @Path("/{id}") @POST
    public String update(@BeanParam Project project) {
        projectRepository.save(project);
        return "redirect:projects";
    }

    @Path("/{id}/remove") @GET
    public String delete(@PathParam("id") Integer id) {
        projectRepository.delete(id);
        return "redirect:projects";
    }

}
