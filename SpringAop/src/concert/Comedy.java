package concert;

import org.springframework.stereotype.Component;

/**
 *comedy:ϲ�� 
 *��һ���ӿ��ж��ʵ����ʱ��ʹ���Զ�װ���������⣬�����ҵ����ʵ�ʵ���ࡣ
 *����취��1����ʾ��ѡ��Bean������Ҫ��ʵ���ϼ�@Primary�����Ƽ�
 *         2���޶��Զ�װ���Bean�� ��ʹ��@Autowired��ʱ�򣬼���@Qualifier("id")���޶���Ҫ�������
 **/

@Component
//@Primary
public class Comedy implements Performance {
	
	private String actor ="���ǳ�";
	private String film_name="ϲ��֮��";
	
	@Override
	public void perform() {
		System.out.println("ϲ�翪ʼ����, "+actor+" ������ "+film_name);
	}

}
