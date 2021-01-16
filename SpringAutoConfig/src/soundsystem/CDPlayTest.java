package soundsystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.CDPlayerConfig;


//��ʾ�̳���SpringJUnit4ClassRunner�࣬�ò���������Spring���Ի���
@ContextConfiguration(classes=CDPlayerConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class CDPlayTest {

	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private MediaPlayer mediaPlayer;
	
	@Test  //�����������޴������
	public  void ccc(){
		assertNotNull(cd);
		cd.play();
		System.out.println(cd.getClass().getName());
		System.out.println("2222  test git cccc and pull ddddddd ");
	}	
	
	@Test //�����Զ�װ��
	public void ddd(){
		
		System.out.println("�����Զ�װ��,��CDװ�䵽CDPlayer����");
		mediaPlayer.play();
		System.out.println(mediaPlayer.getClass().getName());
		
	}
}
