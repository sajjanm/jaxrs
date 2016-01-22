package com.leapfrog.javarsex.api;

import com.leapfrog.javarsex.dao.StudentDAO;
import com.leapfrog.javarsex.dao.impl.StudentDAOImpl;
import com.leapfrog.javarsex.entity.Student;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path(value="/studentapi")
public class StudentAPI{
    
    private StudentDAO studentDAO = new StudentDAOImpl();
    
    @GET
    @Produces("text/html")
    public String index(){
        return "<h2>hello world from JAX-RS</h2>";
    }
    
    @Path(value = "/list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> list(){
        return studentDAO.getAll();
    }
    
    @Path(value="/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Student byId(@PathParam("id") int id){
        return studentDAO.getById(id);
    }
    
    @POST
    @Path(value="/save")
    @Produces(MediaType.TEXT_HTML)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String save(@FormParam("first_name")String firstName,@FormParam("last_name")String lastName ){
        return "thank you" +" " +firstName + " " + lastName;
    }
    
}