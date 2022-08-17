import java.time.LocalDate;

public class Manish5 {
    public static void main(String[] args) {
//        String name= new String("ManishBasnet");
//        System.out.println(name);
//        System.out.println(name.toUpperCase());
//        LocalDate nows = LocalDate.now();
//        System.out.println(nows.getYear());
        int a = 50;
        int b = a;
        a = 30;
        System.out.println("a =" + a + " and b =" + b);

        Person Salman = new Person("Salman");
        Person manish = Salman;

        System.out.println("before changing Salman");
        System.out.println(Salman.name + " " + manish.name);

        Salman.name = "SalmanKhan";
        System.out.println("after changing Salman");
        System.out.println(Salman.name + " " + manish.name);
    }

        static class Person{
            String name;
            Person(String name){
                this.name = name;
            }
        }
    }
