package dao.video;

import model.VideoEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class VideoDaoImpl implements VideoDao{

    @Qualifier("sessionFactory")
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<VideoDao> getVideos() {
        return null;
    }

    @Override
    public void getVideoById(Integer id) {

    }

    @Override
    public void addVideo(String url) {
        VideoEntity videoEntity = new VideoEntity();
        videoEntity.setUrl(url);
        Session s = sessionFactory.openSession();
        Transaction tx= s.beginTransaction();
        s.save(videoEntity);
        tx.commit();
    }

    @Override
    public void deleteVideoById(Integer id) {

    }

    @Override
    public void updateVideoById(Integer id, String url) {

    }
}
