package wrc.xy.interceptor;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootConfiguration
public class WebAppConfig extends WebMvcConfigurerAdapter{

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		//注册自定义拦截器，添加拦截路径和排除拦截路径
		registry.addInterceptor(new userConfig()).addPathPatterns("/admin/*").excludePathPatterns("/admin/login");
	}

}
