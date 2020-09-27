package demo.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service
@Component
public class DemoServiceImpl implements DemoService {
	public  DemoServiceImpl(){
		System.out.println("DemoServiceImpl11111");
	}

	public String sayHello() {
		System.out.println("hello dubbo!");
		return "hello dubbo!";
	}

}
