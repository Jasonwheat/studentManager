package com.jason;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    public static void main(String[] args) {
        //创建集合对象，存储学生数据
        ArrayList<Student> array = new ArrayList<>();

        while (true) {
            System.out.println("---Welcome to the student management system!---");
            System.out.println("1 Add student");
            System.out.println("2 View student");
            System.out.println("3 Delete student");
            System.out.println("4 Update student");
            System.out.println("5 Exit system");
            System.out.println("Please input your choice:");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {
                case "1":
                    //System.out.println("Add student");
                    addStudent(array);
                    break;
                case "2":
                    //System.out.println("View student");
                    findAllStudent(array);
                    break;
                case "3":
                    //System.out.println("Delete student");
                    deleteStudent(array);
                    break;
                case "4":
                    //System.out.println("Update student");
                    updateStudent(array);
                    break;
                case "5":
                    System.out.println("Thanks!");
                    System.exit(0);//JVM退出
            }
        }

    }

    //添加学生信息
    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input student id:");
        String sid = sc.nextLine();

        int index = 0;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            index = i;
            if (s.getSid().equals(sid)) {
                index = -1;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Id already exists!");
        } else {
            System.out.println("Please input student name:");
            String name = sc.nextLine();
            System.out.println("Please input student age:");
            int age = sc.nextInt();
            sc.nextLine();//取出缓冲区留下的空白符
            System.out.println("Please input student address:");
            String address = sc.nextLine();

            //创建学生对象，把键盘录入数据赋值给学生对象的成员变量
            Student s = new Student(sid, name, age, address);

            array.add(s);
            System.out.println("Success!");
        }


    }

    //查看学生信息
    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("No information.Please add first.");
        } else {
            System.out.println("  id\tname\tage\t\taddress");
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                System.out.println(i+1 +"." + s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "\t\t" + s.getAddress());
            }
        }
    }

    //删除学生信息
    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student id to be deleted:");
        String sid = sc.nextLine();
        //遍历集合找到学生对象，从集合中删除
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Wrong id!");
        } else {
            array.remove(index);
            System.out.println("Delete successful!");
        }
    }

    //修改学生信息
    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student id to be updated:");
        String sid = sc.nextLine();

        int index = -1;

        //遍历集合找到学生对象，从集合中修改
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Wrong id!");
        } else {
            System.out.println("Input new name:");
            String name = sc.nextLine();
            System.out.println("Please input student age:");
            int age = sc.nextInt();
            sc.nextLine();//取出缓冲区留下的空白符
            System.out.println("Please input student address:");
            String address = sc.nextLine();

            Student s = new Student();
            s.setSid(sid);
            s.setName(name );
            s.setAge(age);
            s.setAddress(address);
            array.set(index,s);
            System.out.println("Delete successful!");
        }

    }

}
