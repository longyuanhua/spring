package soundsystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.CDPlayerConfig;


//表示继承了SpringJUnit4ClassRunner类，让测试运行于Spring测试环境
@ContextConfiguration(classes=CDPlayerConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class CDPlayTest {

	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private MediaPlayer mediaPlayer;
	
	@Test  //测试容器有无创建组件
	public  void ccc(){
		assertNotNull(cd);
		cd.play();
		System.out.println(cd.getClass().getName());
		System.out.println("2222  test git cccc and pull ddddddd ");
	}	
	
	@Test //测试自动装配
	public void ddd(){
		
		System.out.println("测试自动装配,将CD装配到CDPlayer类中");
		mediaPlayer.play();
		System.out.println(mediaPlayer.getClass().getName());
		
	}
}
