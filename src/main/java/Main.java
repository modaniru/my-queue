import java.util.LinkedList;
import java.util.Queue;

import Object.LinkedQueue;
import Object.Animal;
import Object.Car;
import Object.BMW;
import Object.Ferrari;

public class Main {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal("Krasavchik", 5);
        Animal animal1 = new Animal("Животное", 100);
        Animal animal2 = new Animal("попугай", 321);
        Animal animal3 = new Animal("собака", 12);
        LinkedQueue<Animal> linkedQueue = new LinkedQueue<Animal>();
        linkedQueue.printQueue();
        linkedQueue.push(animal);

        linkedQueue.printQueue();
        linkedQueue.push(animal1);
        linkedQueue.push(animal2);
        linkedQueue.push(animal3);
        //////////////////////////
        Animal animal4 = linkedQueue.pop();
        System.out.println(animal4);
        linkedQueue.printQueue();
        //////////////////////////
        System.out.println(linkedQueue.front());
        System.out.println(linkedQueue.isEmpty());
        linkedQueue.pop();
        linkedQueue.pop();
        linkedQueue.pop();
        linkedQueue.printQueue();
        System.out.println();
        LinkedQueue<Animal> q = linkedQueue.copy();
        q.printQueue();
        q.push(animal1);
        q.printQueue();
        linkedQueue.printQueue();

        q.push(animal2);
        q.printQueue();
        linkedQueue.printQueue();

        linkedQueue = q.copy();
        System.out.println();
        q.printQueue();
        linkedQueue.printQueue();
    }
}
