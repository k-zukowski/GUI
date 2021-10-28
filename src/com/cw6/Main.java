package com.cw6;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main  {
    public static void main(String[] args) throws InterruptedException {

        List<Double> list = Stream.iterate(1, ele -> ele+1)
                .takeWhile(e->e<=20)
                .map(x->Math.pow(x,2))
                /*.forEach(x-> System.out.print(x + ", "))*/
                .collect(Collectors.toList());
        System.out.println(list);

        List<Student2> newlist = Stream.iterate(1,i->i+1)
                .takeWhile(integer -> integer<=12)
                .map(x-> new Student2("student nr" + x, round(Math.random()*(5-2)+2,2)))
                .collect(Collectors.toList());

        //System.out.println(newlist);
        for (Student2 s:newlist) {
            System.out.println(s + ", ");
        }
        System.out.println("=========================================================================================");

        long count = newlist.stream()
                .filter(x->x.getAvgGrade()>3)
                .count();

        System.out.println("Zad 5. ile = " + count);
        System.out.print("min = ");
        newlist.stream()
                /*.min(Comparator.comparingDouble(Student2::getAvgGrade))
                .get().getName()*/
                .sorted(Comparator.comparingDouble(Student2::getAvgGrade))
                .limit(1)
                .forEach(System.out::println);
        System.out.print("max = ");
        newlist.stream()
                .sorted(Comparator.comparingDouble(Student2::getAvgGrade).reversed())
                .limit(1)
                .forEach(System.out::println);
        System.out.println("zad6");
        System.out.print("total count = ");
        long total=
        newlist.stream()
                .count();
        System.out.println(total);
        System.out.print("distinct count = ");
        long dis=
        newlist.stream()
                .map(x->x.getAvgGrade())
                .distinct()
                .count();
        System.out.println(dis);
        System.out.println("zad7");
        System.out.println("Czy sa powtorki? --> " + ((dis<total)?"ya":"nay"));

        /*Thread b = new SecondThread();
        Runnable a = new FirstThread();
        Thread aa = new Thread(a);
        Thread bbb = new Thread(new Runnable() {
            @Override
            public void run() {
                int b=10;

                for (int i = 0; i < b; i++) {
                    System.out.println("b");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("end of b");
            }
        });

        Thread aaa = new Thread(()->{

            int x=10;

            for (int i = 0; i < x; i++) {
                System.out.println("a");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("end of a");

            });

        */
        /*aa.start();
        b.start();
        aa.join();
        b.join();*/
        /*
        bbb.start();
        aaa.start();
        bbb.join();
        aaa.join();*/

    }
    public static double round(double val, int i) {
        if (i < 0) throw new IllegalArgumentException();

        long fac = (long) Math.pow(10, i);
        val = val * fac;
        long tmp = Math.round(val);
        return (double) tmp / fac;
    }
}
