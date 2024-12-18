import java.util.Comparator;
import java.util.PriorityQueue;
public class ComparableClass{
    public static void main(String args[]){
        PriorityQueue<Student> pq =  new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("Abhishek", 100  ));
        pq.add(new Student("Aniket", 99));
        pq.add(new Student("Aditya", 101));
        pq.add(new Student("Amit", 102));

        while(!pq.isEmpty()){
            System.out.print(pq.peek().name + " -> " + pq.peek().rank + " ");
            pq.remove();
        }
        System.out.println();
    }   
}

class Student implements Comparable<Student>{
    String name;
    int rank;

    Student(String name, int rank){
        this.name = name;
        this.rank = rank;
    }

    @Override
    public int compareTo(Student s2){
        return this.rank - s2.rank;
    }
}
