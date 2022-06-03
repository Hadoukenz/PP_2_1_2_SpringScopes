import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld fHW =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld sHW =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(fHW == sHW);

        Cat catOne = (Cat) applicationContext.getBean("cat");
        Cat catTwo = (Cat) applicationContext.getBean("cat");
        System.out.println(catOne == catTwo);

    }
}