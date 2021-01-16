package com.spring.soundsystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.config.CDPlayerConfig;


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
		System.out.println("over!");
	}	
	
	@Test //�����Զ�װ��
	public void ddd(){
		
		System.out.println("����JavaConfigװ��,��CDװ�䵽CDPlayer����");
		mediaPlayer.play();
		System.out.println(mediaPlayer.getClass().getName());
		
	}
}
