import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage() + "\n");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("Сравнение пары бинов HelloWorld\nРезультат: " + (bean == bean2) + "\n");


        Cat cat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getMessage() + "\n");
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println("Сравнение пары бинов Cat\nРезультат: " + (cat == cat2) + "\n");


    }
}