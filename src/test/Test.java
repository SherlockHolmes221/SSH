package test;

import dao.video.VideoDao;
import dao.video.VideoDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
        VideoDao videoDao = (VideoDaoImpl) ac.getBean("videoDaoImpl");
        String url ="https://www.bilibili.com/bangumi/play/ep172122/";
        videoDao.addVideo(url);

//        ApplicationContext ac = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
//        TestService ts = (TestService)ac.getBean("testService");
//        ts.hello();
    }
}
