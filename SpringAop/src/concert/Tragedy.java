package concert;

import org.springframework.stereotype.Component;

/**
 * tragedy:����
 **/
@Component
public class Tragedy implements Performance {
	
	private String actor ="������";
	private String film_name="������֮�¹ⱦ��";
	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("���翪ʼ���ݣ�"+actor+" ������ "+film_name);
	}

}
