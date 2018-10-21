/**
 * 
 */
package cn.wsyjlly.test;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author     	晏沈威
 * @Email	   	wsyjlly@qq.com
 * @Type_name  	ControllerTest
 * @Createtime 	2018年9月23日 下午3:25:07
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailTest {
	@Autowired
	private JavaMailSender mailSender;

	@Test
	public void test1() {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setSubject("测试");
		message.setText("睡觉！");
		message.setTo("wsyjlly@wsyjlly.cn");
		message.setFrom("wsyjlly@foxmail.com");
		
		//mailSender.send(message);
		System.out.println(message);
	}
	
	@Test
	public void test2() throws MessagingException {
		//创建复杂消息邮件
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
		//邮件发送
		helper.setSubject("just Test");
		helper.setText("<b style='color:#ff6700;font-size:16px;'>hello,zzx</b>",true);
		helper.setFrom("wsyjlly@foxmail.com");
		
		//llx 1246870365@qq.com	895864393@qq.com
		helper.setTo("895864393@qq.com");
		
		//上传文件
		helper.addAttachment("zzx1.jpg", new File("D:\\拾忆\\WebDevelopment\\日常文档\\2018日常文档\\日常文档\\1601141038.jpg"));
		helper.addAttachment("zzx2.docx", new File("D:\\拾忆\\WebDevelopment\\日常文档\\2018日常文档\\日常文档\\尚硅谷视频资源\\尚硅谷前端学习（入门到精通）.docx"));
		helper.addAttachment("zzx3.mp4", new File("D:\\拾忆\\WebDevelopment\\日常文档\\2018日常文档\\iK4XkGSmlleijOwlzWi@@hd.mp4"));
		helper.addAttachment("zzx4.jar", new File("D:\\拾忆\\WebDevelopment\\日常文档\\2018日常文档\\日常文档\\软件\\Eclipse lombok插件\\lombok.jar"));
		
		//mailSender.send(mimeMessage);
		System.out.println(helper);
	}
}
