package CVApp;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PDService {
    private NameRepo nameRepo;

    public Name createName (Name newName){
        return nameRepo.save(newName);
    }

}
