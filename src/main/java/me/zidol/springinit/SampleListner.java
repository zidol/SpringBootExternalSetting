package me.zidol.springinit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleListner implements ApplicationRunner {
    @Autowired
    ZidolProperties zidolProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("==============");
        System.out.println(zidolProperties.getName());
        System.out.println(zidolProperties.getAge());
        System.out.println(zidolProperties.getSessionTimeout());
        System.out.println("===============");
    }
//    public SampleListner(ApplicationArguments arguments) {
//        System.out.println("foo : " + arguments.containsOption("foo")) ;
//        System.out.println("bar : " + arguments.containsOption("bar")) ;
//    }

//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        System.out.println("foo : " + args.containsOption("foo")) ;
//        System.out.println("bar : " + args.containsOption("bar")) ;
//    }


}
