package CVApp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PDService {
    private final PersonRepo personRepo;


    public Person createPerson (Person newPerson){
        return personRepo.save(newPerson);
    }
}
