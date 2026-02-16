package L18_Queues;

class CircularQueue{
    int[] arr;
    int front;
    int rear;
    int size;

    CircularQueue(int capacity){
        arr = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    void add(int value){
        if(size == arr.length) {
            System.out.println("Queue is full");
            return;
        }

        arr[rear++] = value;
        if(rear == arr.length)
            rear = 0;

        size++;
    }

    int remove(){
        if(size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int frontVal = arr[front];
        front++;
        if(front == arr.length)
            front = 0;

        size--;

        return frontVal;
    }

    void display(){
        if(size == 0)
            return;

        if(front >= rear){
            for (int i = front; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = 0; i < rear; i++) {
                System.out.print(arr[i] + " ");
            }
        }else {
            for (int i = front; i < rear; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}

public class C8_CircularArrayQueue {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(4);
        q.add(10);
        q.add(20);
        q.add(30);
        q.display();
        System.out.println(q.remove());
        q.display();
        q.add(40);
        q.add(50);
        q.display();

        int[] arr = q.arr;
        for(int x : arr)
            System.out.print(x + " ");
    }
}
