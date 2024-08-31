package lk.ijse.aad;

import lk.ijse.aad.config.Config;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {
        var ctx = new AnnotationConfigApplicationContext();//we make the spring application context
        ctx.register(Config .class);//register the agent
        ctx.refresh();//refresh
    var myObj = ctx.getBean("myObj");
        System.out.println(myObj);
    ConfigurableBeanFactory beanFactory = ctx.getBeanFactory();
        System.out.println("Is bean singleton:" + beanFactory.isSingleton("myObj"));
        ctx.registerShutdownHook();
}
