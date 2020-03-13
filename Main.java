
package com.prac;
import java.util.ArrayList;

interface Student
{
    void ask();
}

interface Teacher
{
    void speak();
    void listen();
}

public class Main {

    static void test_j5() {
        System.out.println("$$$$$$$$\tprac-test-java5-beg\t$$$$$$$$");

        // 匿名子类
        Student sdent = () -> System.out.println("Student::ask");
        sdent.ask();

        Teacher tcher = new Teacher() {
            @Override
            public void speak() {
                System.out.println("Teacher::speak");
            }

            @Override
            public void listen() {
                System.out.println("Teacher::listen");
            }

            {
                System.out.println("Teacher::init");
            }
        };
        tcher.speak();
        tcher.listen();

        // 循环
        var ilist = new ArrayList<>() {
            {
                add("11");
                add(22);
                add("33");
            }
        };

        for (var i : ilist)
        {
            System.out.println(i);
        }

        System.out.println("$$$$$$$$\tprac-test-java5-end\t$$$$$$$$");
    }

    public static void main(String[] args) {
        System.out.println("########\tprac-beg\t########");
        test_j5();
        System.out.println("########\tprac-end\t########");
    }
}
