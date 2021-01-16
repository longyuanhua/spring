package soundsystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


//��ʾ�̳���SpringJUnit4ClassRunner�࣬�ò���������Spring���Ի���
@ContextConfiguration(classes=CDPlayerConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class CDPlayTest {

	@Autowired
	private CompactDisc cd;
	
	
	@Test
	public  void ccc(){
		assertNotNull(cd);
		System.out.println(cd);
		cd.play();
		System.out.println(cd.getClass().getName());
	}	
	
}
