package L22_Heaps;

import java.util.*;

public class C8_Comparable_N_Comparator {

    // Comparable → defines DEFAULT sorting (inside class)
    static class Student implements Comparable<Student>{
        String name;
        int rno;
        double cgpa;

        public Student(String name, int rno, double cgpa) {
            this.name = name;
            this.rno = rno;
            this.cgpa = cgpa;
        }

        // default sorting rule → by rno
        @Override
        public int compareTo(Student s) {
            return Integer.compare(this.rno, s.rno);
        }

        @Override
        public String toString() {
            return "name : " + name + " --> rno : " + rno + " --> cgpa : " + cgpa;
        }
    }


    // Comparator → CUSTOM sorting (outside class)
    // sort by name
    static class SortByName implements Comparator<Student>{
        @Override
        public int compare(Student s1, Student s2) {
            return s1.name.compareTo(s2.name);
        }
    }

    // sort by roll number
    static class SortByRno implements Comparator<Student>{
        @Override
        public int compare(Student s1, Student s2) {
            return s1.rno - s2.rno;
        }
    }

    // sort by cgpa
    static class SortByCgpa implements Comparator<Student>{
        @Override
        public int compare(Student s1, Student s2) {
            return Double.compare(s1.cgpa, s2.cgpa);
        }
    }

    public static void main(String[] args) {

        // creating objects
        Student s1 = new Student("a" , 1, 9.8);
        Student s2 = new Student("b" , 18, 8.3);
        Student s3 = new Student("c" , 12, 9.5);
        Student s4 = new Student("d" , 7, 6.7);

        // array of students
        Student[] arr = {s1,s2,s3,s4};

        // print original order
        for (Student s : arr)
            System.out.println(s);

        // uses Comparable → default sorting (by rno)
        Arrays.sort(arr);

        // print sorted (by rno)
        for (Student s : arr)
            System.out.println(s);

        // list for comparator sorting
        List<Student> list = new ArrayList<>();
        list.add(s1); list.add(s2); list.add(s3); list.add(s4);

        // uses Comparator → custom sorting (overrides default)

        Collections.sort(list , new SortByRno());   // sort by rno
        System.out.println(list);

        Collections.sort(list , new SortByName());  // sort by name
        System.out.println(list);

        Collections.sort(list , new SortByCgpa());  // sort by cgpa
        System.out.println(list);
    }
}