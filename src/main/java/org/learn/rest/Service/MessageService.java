package org.learn.rest.Service;

import org.learn.rest.database.DatabaseClass;
import org.learn.rest.model.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MessageService {

    private static Map<Long, Message> messages = DatabaseClass.getMessages();

    public MessageService() {

        messages.put(1L, new Message(1, "hello", "KASHISH"));
        messages.put(2L, new Message(2, "hello12313", "KASH"));


    }

    public List<Message> getallMessages() {

        return new ArrayList<Message>(messages.values());

    }

    public Message GetMessageId(Long id ){

        return messages.get(id);

    }


    public Message addMessage(Message message) {
        message.setId(messages.size() + 1);
        messages.put(message.getId(), message);
        return message;

    }

    public  Message updateMessage(Message message){
        if(message.getId()<=0){
            return null;

        }

        else {
            messages.put(message.getId(), message);

        }
            return message;

    }


    public Message delMessage(Long id){

        return messages.remove(id);


    }



}



