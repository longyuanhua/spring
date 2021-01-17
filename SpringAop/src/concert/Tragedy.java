package concert;

import org.springframework.stereotype.Component;

/**
 * tragedy:悲剧
 **/
@Component
public class Tragedy implements Performance {
	
	private String actor ="蓝洁瑛";
	private String film_name="大话西游之月光宝盒";
	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("悲剧开始上演，"+actor+" 表演了 "+film_name);
	}

}
