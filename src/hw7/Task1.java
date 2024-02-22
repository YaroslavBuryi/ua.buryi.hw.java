import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Field;
public class Task1 {
    public static void main(String[] args) throws Exception {
        A instance = createInstance(A.class);
        System.out.println("Before modification:");
        System.out.println(instance);
        setPrivateField(instance, "id", "456");
        setPrivateField(instance, "name", "B");
        System.out.println("\nAfter modification:");
        System.out.println(instance);
    }
    public static <T> T createInstance(Class<T> clazz) throws Exception {
        java.lang.reflect.Constructor<T> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        return constructor.newInstance();
    }
    public static void setPrivateField(Object object, String fieldName, Object value) throws Exception {
        Field field = object.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(object, value);
    }
}
class A {
    private String id = "123";
    private String name = "A";
    private A() {
    }
    @Override
    public String toString() {
        return "A{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
