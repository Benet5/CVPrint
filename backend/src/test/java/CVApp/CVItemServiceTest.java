package CVApp;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CVItemServiceTest {

    @Test

    void ShouldSaveAnItem(){
        CVItemRepo cvItemRepo = mock(CVItemRepo.class);
        CVItemService service = new CVItemService(cvItemRepo);

CVItem newItem = new CVItem("123",null, null, "Sales Manager", "KLG GmbH", "Verkaufen", "After Sales","Key Account");

when(cvItemRepo.save(newItem)).thenReturn(newItem);
var actual = service.saveItem(newItem);

assertEquals("Sales Manager", actual.getPosition());
    }

    @Test
    void ShouldgetAllItems() {
        CVItemRepo cvItemRepo = mock(CVItemRepo.class);
        CVItemService service = new CVItemService(cvItemRepo);
        CVItem newItem2 = new CVItem("1235", null, null, "HR Manager", "KLG GmbH", "Rekrutieren", "Diagnostik", "Key Account");
        CVItem newItem = new CVItem("123", null, null, "Sales Manager", "KLG GmbH", "Verkaufen", "After Sales", "Key Account");

        List<CVItem> allItems = List.of(newItem, newItem2);

        when(cvItemRepo.findAll()).thenReturn(allItems);
        var actual = service.getAllItems();

        assertEquals(2, actual.size());
    }
    }