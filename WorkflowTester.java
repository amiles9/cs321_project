import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.Test;

import com.example.WorkflowTable;


public class WorkflowTester {
    

    @Test
    public void constructorTest() {
        WorkflowTable current = new WorkflowTable();
        assertNotNull("The created object should not be null", current);
    }

    @Test
    public void emptyQueueTest(){
        WorkflowTable current = new WorkflowTable();
        assertEquals(current.nextReviewForm(), -1);
        assertEquals(current.nextApproveForm(), -1);
    }

    @Test
    public void addReviewForm_test(){
        WorkflowTable current = new WorkflowTable();
        current.addReviewForm(1);
        assertEquals(current.nextReviewForm(), 1);
    }

    @Test
    public void testAddReviewFormWithNonInteger() {
        WorkflowTable current = new WorkflowTable();
        assertThrows(IllegalArgumentException.class, () -> current.add_review_form("nonIntegerValue"));
    }

    @Test
    public void testAddReviewFormWithNull() {
        WorkflowTable current = new WorkflowTable();
        assertThrows(IllegalArgumentException.class, () -> current.add_review_form(null));
    }

    @Test
    public void addApproveForm_test(){
        WorkflowTable current = new WorkflowTable();
        current.addApproveForm(1);
        assertEquals(current.nextApproveForm(), 1);
    }

    @Test
    public void testAddApproveFormWithNonInteger() {
        WorkflowTable current = new WorkflowTable();
        assertThrows(IllegalArgumentException.class, () -> current.add_approve_form("nonIntegerValue"));
    }

    @Test
    public void testAddApproveFormWithNull() {
        WorkflowTable current = new WorkflowTable();
        assertThrows(IllegalArgumentException.class, () -> current.add_approve_form(null));
    }

    @Test(expected = IllegalArgumentException.class)
    public void illegalReviewAdd(){
        WorkflowTable current = new WorkflowTable();
        current.addReviewForm(-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void illegalApproveAdd(){
        WorkflowTable current = new WorkflowTable();
        current.addApproveForm(-5);
    }

    @Test
    public void nextFormTests(){
        WorkflowTable current = new WorkflowTable();
        current.addApproveForm(2);
        current.addReviewForm(2);
        assertEquals(current.nextReviewForm(), 2);
        assertEquals(current.nextApproveForm(), 2);
    }
}
