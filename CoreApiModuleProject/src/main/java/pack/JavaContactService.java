package pack;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;


public interface JavaContactService {

    void createContact (String firstName, String lastName, LocalDate date);
    void addHobby (String title, String description);
    void addPlace (String title, String description, double longitude, double latitude);
    void addFriedship (Contact firstContact, Contact secondContact);
    Set<Contact> getFriedList(Contact contact);
    List<Message> getConversation (Contact firstContact, Contact secondContact);
}
