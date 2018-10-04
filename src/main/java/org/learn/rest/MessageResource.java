package org.learn.rest;


import org.learn.rest.Service.MessageService;
import org.learn.rest.model.Message;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/message")
public class MessageResource {

    MessageService service = new MessageService();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public List<Message> getMessages(){


        return service.getallMessages();
    }


    @Path("/{messageid}")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Message getMessage(@PathParam("messageid") long id){

        return service.GetMessageId(id);

    }


}
