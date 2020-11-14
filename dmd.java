//Q4

class A

{

    void  t1()

    {

        System.out.println("In A");

    }

}


class B extends A

{

    void  t1()

    {

        System.out.println("In B");

    }

}


class C extends A

{

    void  t1()

    {

        System.out.println("In C");

    }

}


class Dispatch

{

    public static void main(String args[])

    {

        A a = new A();

        B b = new B();

        C c = new C();

        A r;

        r = a;

        r. t1();

        r = b;

        r. t1();

        r = c;

        r. t1();
    }
}