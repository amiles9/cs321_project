import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

import com.example.WorkflowTable;


public class WorkflowTester {
    
    WorkflowTable current = new WorkflowTable();

    @Test
    public void emptyQueueTest(){
        assertEquals(current.nextReviewForm(), -1);
        assertEquals(current.nextApproveForm(), -1);
    }

    @Test
    public void addReviewForm_test(){
        current.addReviewForm(1);
        assertEquals(current.nextReviewForm(), 1);
    }

    @Test
    public void addApproveForm_test(){
        current.addApproveForm(1);
        assertEquals(current.nextApproveForm(), 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void illegalReviewAdd(){
        current.addReviewForm(-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void illegalApproveAdd(){
        current.addApproveForm(-5);
    }

    @Test
    public void nextFormTests(){
        current.addApproveForm(2);
        current.addReviewForm(2);
        assertEquals(current.nextReviewForm(), 2);
        assertEquals(current.nextApproveForm(), 2);
    }
}
