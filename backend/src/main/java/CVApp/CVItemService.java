package CVApp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CVItemService {

    private final CVItemRepo cvItemRepo;

    public List<CVItem> getAllItems(){
        return cvItemRepo.findAll();
    }

    public CVItem saveItem(CVItem newItem){
        return cvItemRepo.save(newItem);
    }
}
