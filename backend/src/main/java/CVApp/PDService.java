package CVApp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PDService {
    private final PersonRepo personRepo;


    public Person createPerson (Person newPerson){
        return personRepo.save(newPerson);
    }

    public List<Person> getPersons(){
        return personRepo.findAll();
    }
}
