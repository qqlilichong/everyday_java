
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

enum Planet {
    EARTH(1101),
    MARS(1102);

    private final int number;
    Planet(int num)
    {
        this.number = num;
    }

    public int getNumber() {
        return this.number;
    }
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

        // 类型安全枚举
        System.out.println(Planet.valueOf("EARTH").getNumber());
        System.out.println(Planet.valueOf("MARS").getNumber());
        for (var p : Planet.values())
        {
            System.out.printf("Planet %s : %d%n", p, p.getNumber());
        }

        System.out.println("$$$$$$$$\tprac-test-java5-end\t$$$$$$$$");
    }

    public static void main(String[] args) {
        System.out.println("########\tprac-beg\t########");
        test_j5();
        System.out.println("########\tprac-end\t########");
    }
}
