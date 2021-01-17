package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import concert.Performance;
import config.ConcertConfig;


//��ʾ�̳���SpringJUnit4ClassRunner�࣬�ò���������Spring���Ի���
@ContextConfiguration(classes=ConcertConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ComedyAopTest {

	@Autowired
	@Qualifier("tragedy")
	private Performance performance;
	
	@Test //�����Զ�װ��
	public void testAspectjAop(){
		
		System.out.println("����SpringAop��ʹ��aspectjע�ⴴ������...");
		performance.perform();
		System.out.println(performance.getClass().getName());
		
	}
}
