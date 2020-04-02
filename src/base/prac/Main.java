
package base.prac;
import java.util.*;
import java.io.*;

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

    static void test_j5_f1(String... args) {
        for (var arg : args)
        {
            System.out.println(arg);
        }
    }

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
        System.out.println(Planet.EARTH.getNumber());
        System.out.println(Planet.MARS.getNumber());
        for (var p : Planet.values())
        {
            System.out.printf("Planet %s : %d%n", p.name(), p.getNumber());
        }

        // 可变参数函数
        test_j5_f1("4", "5", "6");

        System.out.println("$$$$$$$$\tprac-test-java5-end\t$$$$$$$$");
    }

    static void test_j7() {
        System.out.println("$$$$$$$$\tprac-test-java7-beg\t$$$$$$$$");

        System.out.println(0X1100);
        System.out.println(0B1100);
        System.out.println(12_34_56);

        String[] sarr = {"hello", "world"};
        for (var str : sarr) {
            switch (str) {
                case "hello":
                    System.out.println("switch string hello.");
                    break;
                case "world":
                    System.out.println("switch string world.");
                    break;
            }
        }

        Map<String, String> smap = new HashMap<>();
        smap.put("a", "A");
        smap.put("b", "B");
        smap.put("c", "C");
        for (var key : smap.keySet())
        {
            System.out.println(smap.get(key));
        }

        try (var reader = new BufferedReader(new FileReader("C:/Windows/system.ini"))) {
            System.out.println(reader.readLine());
        }
        catch (IOException | RuntimeException e)
        {
            e.printStackTrace();
        }

        System.out.println("$$$$$$$$\tprac-test-java7-end\t$$$$$$$$");
    }

    static void test_j8() {
        System.out.println("$$$$$$$$\tprac-test-java8-beg\t$$$$$$$$");

        System.out.println("$$$$$$$$\tprac-test-java8-end\t$$$$$$$$");
    }

    public static void main(String[] args) {
        System.out.println("########\tprac-beg\t########");
        test_j5();
        test_j7();
        test_j8();
        System.out.println("########\tprac-end\t########");
    }
}
