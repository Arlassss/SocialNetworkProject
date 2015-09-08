package pack;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;


public class First implements JavaContactService {


    public void createContact(String firstName, String lastName, LocalDate date) {

    }

    public void addHobby(String title, String description) {

    }

    public void addPlace(String title, String description, double longitude, double latitude) {

    }

    public void addFriedship(Contact firstContact, Contact secondContact) {

    }

    public Set<Contact> getFriedList(Contact contact) {
        return null;
    }

    public List<Message> getConversation(Contact firstContact, Contact secondContact) {
        return null;
    }
}
