import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.*;

public class FormTest {
    @Test
    public void getStatusTest(){
        Form form = new Form();
        String status = "R";
        form.status = status;
        assertEquals(form.getStatus(), status);
    }
    @Test
    public void setStatusTest(){
        Form form = new Form();
        String status = "R";
        form.setStatus(status);
        assertEquals(form.status, status);
    }
    @Test
    public void getFormTest(){
        Form form = new Form();
        int id = 0;
        form.setID(id);
        form.updateDatabase();
        assertEquals(Form.getForm(id), form);
    }

    @Test
    public void submitFormTest() {
        Form form = new Form();
        form.submitForm();
        assertEquals(form.getStatus(), "Submitted");

        Form nullForm = new Form().setForm(null);
        nullForm.submitForm();
        assertEquals(nullForm.getStatus(), "NULL FORM");
    }

    @Test
    public void updateFormStatusTest() {
        Form form = new Form();
        form.updateFormStatus("Updated");
        assertEquals(form.getStatus(), "Updated");

        Form nullForm = new Form().setForm(null);
        nullForm.updateFormStatus("Updated");
        assertEquals(nullForm.getStatus(), "NULL FORM");

        Form editedForm = new Form().setForm("Edited");
        editedForm.updateFormStatus("Edited");
        assertEquals(editedForm.getStatus(), "Edited");

        Form inReviewForm = new Form().setForm("Review");
        inReviewForm.updateFormStatus("Review");
        assertEquals(inReviewForm.getStatus(), "Review");

        Form inApprovalForm = new Form().setForm("Approval");
        inApprovalForm.updateFormStatus("Approval");
        assertEquals(inApprovalForm.getStatus(), "Approval");

        Form approvedForm = new Form().setForm("Approved");
        approvedForm.updateFormstatus("Approved");
        assertEquals(approvedForm.getStatus(), "Approved");
    }

    @Test
    public void getIDTest() {
        Form form = new Form().setID(0);
        assertEquals(form.getID(), 0);

        Form nullForm = new Form().setID(null);
        assertEquals(nullForm.getID(), null);

        Form editedForm = new Form().setID(-1);
        assertEquals(editedForm.getID(), null);
    }
}
