import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;


public class WorkflowTester {
    
    WorkflowTable current = new WorkflowTable();

    @Test
    public void emptyQueueTest(){
        assertEquals(current.next_review_form(), -1);
        assertEquals(current.next_approve_form(), -1);
    }

    @Test
    public void add_review_form_test(){
        current.add_review_form(1);
        assertEquals(current.next_review_form(), 1);
    }
}
