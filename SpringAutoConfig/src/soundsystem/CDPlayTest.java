package soundsystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


//表示继承了SpringJUnit4ClassRunner类，让测试运行于Spring测试环境
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
