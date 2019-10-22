import java.util.*;
import java.lang.reflect.*;
public class TestClassReflection {
    public static void main(String args[]) {
        String className = "java.lang.Object";
        if (args.length > 0) {
            className = args[0];
        }
        Class objectClass= null;
        try {
            objectClass = Class.forName(className);
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
        Method[] methods = objectClass.getMethods();
        for (int i = 0; i < methods.length; i++) {
            String name = methods[i].getName();
            Class[] classParameters =
            methods[i].getParameterTypes();
            String stringClassParameters = "";
            for (int j = 0; j < classParameters.length; ++j) {
                stringClassParameters +=
                classParameters[j].toString();
            }
            String methodReturnType =
            methods[i].getReturnType().getName();
            String methodString = methodReturnType + " " +
            name + " (" + stringClassParameters + ")";
            System.out.println(methodString);
        }
    }
}