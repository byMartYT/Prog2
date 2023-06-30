package user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwotterSystem {

    List<User> users = new ArrayList<>();
    Map<User, Message> messageMap = new HashMap<>();


    public void addMessage(User u, Message m) {
        messageMap.put(u, m);
    }

    public List<Message> getAllMessages(){
        return (List<Message>) messageMap.values();
    }
    public List<Message> getAllMessagesFromUser(User u){
        
    }
    public List<Message> getAllMessagesFromDate(String d){

    }

}
