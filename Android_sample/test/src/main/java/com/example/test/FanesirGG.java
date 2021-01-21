package com.example.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

interface Student {
    String introduce();

    Object getThingsFromBag(String name);

    void putThingsToBag(String name, Object object);

    int getAge();
}

interface Bag {
    Object take(String name);

    void put(String name, Object object);
}

class MyBag implements Bag {
    String name;
    Object object;

    @Override
    public Object take(String name) {
        return this.object;
    }

    @Override
    public void put(String name, Object object) {
        this.name = name;
        this.object = object;
    }
}

public class FanesirGG  {
    public final List<Student> students = new ArrayList<>();

    boolean addStudent(Student student) {
        this.students.add(student);
        // TODO: 加入課本檢查，學生必須帶著國文課本
        // 如果沒有帶國文課本請回傳false，並修正課本
        if (student.getThingsFromBag("book")=="國文"){
            return true;
        }else{
           student.putThingsToBag("book","國文");
            return false;
        }

    }

    void introduceStudent() {
        for (Student student : students) {
            System.out.println(student.introduce());
        }
    }

    List<Student> biggerThen(int age) {
        // TODO: 回傳大於age的學生
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        FanesirGG gg = new FanesirGG();
        for (int i = 0; i < 20; ++i) {

            // TODO: 修正錯誤
            Student student = new BaseStudent(8 + i / 10, "student" + (i + 1), new MyBag());
            // 學生上學要帶書
            student.putThingsToBag("book", "國文");
            if (Math.random() > 0.8) {
                // 有兩成的同學會帶錯課本
                student.putThingsToBag("book", "數學");
                assert (!gg.addStudent(student));
            } else {
                assert (gg.addStudent(student));
            }
        }
        gg.introduceStudent();//?
        for (Student student : gg.biggerThen(9)) {
            assert (student.getAge() > 9);
        }
        for (Student student : gg.students) {
            assert (student.getThingsFromBag("book").equals("國文"));
        }
    }
}

class BaseStudent implements Student {
    private final int age;
    private final String name;
    private final Bag bag;

    BaseStudent(int age, String name, Bag bag) {
        this.age = age;
        this.name = name;
        this.bag = bag;
    }

    public String introduce() {
        return "My name is " + this.name + " and I am " + age + " year old";
    }

    public int getAge() {
        return this.age;
    }

    public Object getThingsFromBag(String name) {
        return this.bag.take(name);
    }

    public void putThingsToBag(String name, Object object) {
        this.bag.put(name, object);
    }

}