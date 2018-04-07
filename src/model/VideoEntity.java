package model;

import com.sun.istack.internal.Nullable;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "video", schema = "api", catalog = "")
public class VideoEntity {
    private int id;
    private String url;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = true)
    public int getId() {
        return id;
    }

    public void setId(@Nullable int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "url", nullable = true, length = 255)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoEntity that = (VideoEntity) o;
        return id == that.id &&
                Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, url);
    }

    public VideoEntity() {
    }

    public VideoEntity(int id, String url) {
        this.id = id;
        this.url = url;
    }
}
