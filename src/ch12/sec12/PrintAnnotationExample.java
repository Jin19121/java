package ch12.sec12;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
    public static void main(String[] args) throws Exception {
        Method[] declaredMethods = Service.class.getDeclaredMethods();
        for (Method method : declaredMethods) {
            //Print Annotation 얻기
            PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
            printLine(printAnnotation);
            method.invoke(new Service());
            printLine(printAnnotation);

        }
    }

    private static void printLine(PrintAnnotation printAnnotation) {
        if (printAnnotation != null) {
            int no = printAnnotation.number();
            for (int i = 0; i < no; i++) {
                String value = printAnnotation.value();
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
