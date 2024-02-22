package hw9;
class Task2 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        try {
            obj.f();
        } catch (MyException2 e) {
            System.out.println("Перехвачено исключение из метода f(): " + e.getMessage());
            System.out.println("Исходное исключение: " + e.getCause().getMessage());
        }
    }
}

class MyClass {
    public void f() throws MyException2 {
        try {
            g();
        } catch (MyException1 e) {
            throw new MyException2("Исключение в методе f()", e);
        }
    }

    public void g() throws MyException1 {
        throw new MyException1("Исключение в методе g()");
    }
}

class MyException1 extends Exception {
    public MyException1(String message) {
        super(message);
    }
}

class MyException2 extends Exception {
    public MyException2(String message, Throwable cause) {
        super(message, cause);
    }
}
