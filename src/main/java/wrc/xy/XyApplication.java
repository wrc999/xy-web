package wrc.xy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement//开启事务注解，相当于<tx:annotation-driven/>
@MapperScan("wrc.xy.dao")  //扫描的是mapper.xml中namespace指向值的包位置
public class XyApplication {

	public static void main(String[] args) {
		SpringApplication.run(XyApplication.class, args);
	}
}
