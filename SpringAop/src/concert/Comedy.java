package concert;

import org.springframework.stereotype.Component;

/**
 *comedy:喜剧 
 *当一个接口有多个实现类时，使用自动装配会出现问题，不能找到合适的实现类。
 *解决办法：1，标示首选的Bean，在想要的实现上加@Primary，不推荐
 *         2，限定自动装配的Bean。 在使用@Autowired的时候，加上@Qualifier("id")在限定想要的组件。
 **/

@Component
//@Primary
public class Comedy implements Performance {
	
	private String actor ="周星驰";
	private String film_name="喜剧之王";
	
	@Override
	public void perform() {
		System.out.println("喜剧开始表演, "+actor+" 表演了 "+film_name);
	}

}
