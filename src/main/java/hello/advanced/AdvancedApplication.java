package hello.advanced;

import hello.advanced.config.AppV1Config;
import hello.advanced.config.AppV2Config;
import hello.advanced.config.v1_proxy.ConcreteProxyConfig;
import hello.advanced.config.v1_proxy.InterfaceProxyConfig;
import hello.advanced.config.v2_dynamicproxy.DynamicProxyBasicConfig;
import hello.advanced.config.v2_dynamicproxy.DynamicProxyFilterConfig;
import hello.advanced.trace.logtrace.LogTrace;
import hello.advanced.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

//@Import(AppV1Config.class)
//@Import({AppV1Config.class ,AppV2Config.class})
//@Import(InterfaceProxyConfig.class)
//@Import(ConcreteProxyConfig.class)
//@Import(DynamicProxyBasicConfig.class)
@Import(DynamicProxyFilterConfig.class)
@SpringBootApplication(scanBasePackages = "hello.advanced.app2")
public class AdvancedApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvancedApplication.class, args);
	}

	@Bean
	public LogTrace logTrace() {
		return new ThreadLocalLogTrace();
	}

}
