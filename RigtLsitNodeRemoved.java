
class RigtLsitNodeRemoved {
    public static void main(String[] arg) {
        LinkList lobj = new LinkList();

        lobj.Geter(5);
        lobj.Geter(2);
        lobj.Geter(13);
        lobj.Geter(13);
        lobj.Geter(8);

        lobj.NodeDisplay();

    }
}

class Node {
    public int data;
    public Node next;

    public Node(int no) {
        this.data = no;
        this.next = null;
    }
}

class LinkList {
    public Node first;
    public int iCount;

    public LinkList() {
        this.first = null;
        this.iCount = 0;
    }

    public int Count() {
        return iCount;
    }

    public void NodeDisplay() {
        Node iTemp = first;

        System.out.println("Display Node is Format");
        System.out.print("  | ");
        while (iTemp != null) {
            System.out.print(iTemp.data + " | ");
            iTemp = iTemp.next;
        }
    }

    public void Geter(int no) {
        Node newn = new Node(no);
        if (first == null) {
            first = newn;
        } else {
            Node iTemp = first;

            while (iTemp.next != null) {
                iTemp = iTemp.next;
            }
            iTemp.next = newn;
        }
        iCount++;
    }

}

class Remover {
    public Node first;

    public void RemoveifitSmall() {
        Node iTemp = first;

        while (iTemp != null && iTemp.next != null) {
          if(iTemp.data < iTemp.next.data)
          {
            iTemp.next = iTemp.next.next;
             
          }
          else
          iTemp = iTemp.next;
        }
    }
}
