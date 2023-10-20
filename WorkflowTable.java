import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class WorkflowTable{

    private Queue<Integer> reviewer_queue;
    private Queue<Integer> approver_queue;

    public WorkflowTable(){
        reviewer_queue = new ArrayDeque<Integer>();
        approver_queue = new ArrayDeque<Integer>();
    }

    public void add_review_form(int id){
        this.reviewer_queue.add(id);
    }

    public void add_approve_form(int id){
        this.approver_queue.add(id);
    }

    public int next_review_form(){
        if(reviewer_queue.peek() == null){
            return -1;
        }
        else return reviewer_queue.poll();
    }

    public int next_approve_form(){
        if(approver_queue.peek() == null){
            return -1;
        }
        else return approver_queue.poll();
    }

}