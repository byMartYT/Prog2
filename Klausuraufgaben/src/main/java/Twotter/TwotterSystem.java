package Twotter;

import java.util.*;
import java.util.stream.Collectors;

public class TwotterSystem {

    List<User> users = new ArrayList<>();

    Map<User, List<Message>> userMessageData = new HashMap<>();

    public void addMessage(User u, Message m){
        try{
            userMessageData.get(u).add(m);
        } catch (NullPointerException e) {
            userMessageData.put(u, new ArrayList<>());
            userMessageData.get(u).add(m);
        }
    }

    public List<Message> getAllMessages() {
        return userMessageData.values().stream().flatMap(Collection::stream).collect(Collectors.toList());
    }

    public List<Message> getAllMessagesFromUser(User u) {
        return userMessageData.get(u);
    }

    public List<Message> getAllMessagesFromDate(String s) {
        return getAllMessages().stream().filter((l) -> l.getCreationDate().equals(s)).collect(Collectors.toList());
    }


}
