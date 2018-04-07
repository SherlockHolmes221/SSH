package service.video;
import dao.video.VideoDao;

import java.util.List;

public interface VideoService {

    //返回列表,json格式
    public List<VideoDao> getVideos();

    //查询数据库
    public void getVideoById(Integer id);

    //新增数据post请求 字段为"url",返回对象
    public void addVideo(String url);

    //删除
    public void deleteVideoById(Integer id);

    //更新
    public void updateVideoById(Integer id, String url);
}
