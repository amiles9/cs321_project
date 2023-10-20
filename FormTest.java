import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.*;

public class FormTest {
    public FormTest(){
        Form form = new Form();
    }
    @Test
    public void getStatusTest(){
        String status = "R";
        form.status = status;
        assertEquals(form.getStatus(), status);
    }
    @Test
    public void setStatusTest(){
        String status = "R";
        form.setStatus(status);
        assertEquals(form.status, status);
    }
    @Test
    public void getFormTest(){
        int id = 0;
        form.setID(id);
        form.updateDatabase();
        assertEquals(Form.getForm(id), form);
    }
}
