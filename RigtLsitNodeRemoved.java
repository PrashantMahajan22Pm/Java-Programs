import java.util.PriorityQueue;


public class RigtLsitNodeRemoved {
    public static void main(String[] args) {
        SinglyLL list1 = new SinglyLL();
        list1.InsertLast(1);
        list1.InsertLast(4);
        list1.InsertLast(5);

        SinglyLL list2 = new SinglyLL();
        list2.InsertLast(1);
        list2.InsertLast(3);
        list2.InsertLast(4);

        SinglyLL list3 = new SinglyLL();
        list3.InsertLast(2);
        list3.InsertLast(6);

        Node[] lists = new Node[]{list1.first, list2.first, list3.first};

        Solution solution = new Solution();
        Node mergedHead = solution.mergeKLists(lists);

        SinglyLL mergedList = new SinglyLL();
        mergedList.first = mergedHead;

        mergedList.Display(); // Expected output: 1 -> 1 -> 2 -> 3 -> 4 -> 4 -> 5 -> 6 -> null
    }
}


class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLL {
    public Node first;
    public int iCount;

    public SinglyLL() {
        this.first = null;
        this.iCount = 0;
    }

    public void Display() {
        System.out.println("Elements of Linked list are : ");
        Node temp = first;
        while (temp != null) {
            System.out.print("| " + temp.data + " |-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int Count() {
        return this.iCount;
    }

    public void InsertFirst(int no) {
        Node newn = new Node(no);
        if (first == null) {
            first = newn;
        } else {
            newn.next = first;
            first = newn;
        }
        iCount++;
    }

    public void InsertLast(int no) {
        Node newn = new Node(no);
        if (first == null) {
            first = newn;
        } else {
            Node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newn;
        }
        iCount++;
    }
}

class Solution {
    public Node mergeKLists(Node[] lists) {
        PriorityQueue<Node> minHeap = new PriorityQueue<>((a, b) -> a.data - b.data);
        
        // Add the head of each non-empty linked list to the priority queue
        for (Node node : lists) {
            if (node != null) {
                minHeap.add(node);
            }
        }
        
        // Create a dummy node to serve as the head of the merged linked list
        Node dummy = new Node(0);
        Node current = dummy;
        
        // Process the priority queue until it is empty
        while (!minHeap.isEmpty()) {
            // Extract the smallest node from the priority queue
            Node smallestNode = minHeap.poll();
            current.next = smallestNode;
            current = current.next;
            
            // If there is a next node in the linked list, add it to the priority queue
            if (smallestNode.next != null) {
                minHeap.add(smallestNode.next);
            }
        }
        
        // Return the merged linked list starting from the next node of the dummy node
        return dummy.next;
    }
}
