package cnlive.com.retrofitmaster.bean;

import java.util.List;

/**
 * @author 陈硕
 * @time 2017/1/19  9:10
 * @desc ${TODD}
 */
public class HomePage {


    @Override
    public String toString() {
        return "HomePage{" +
                "data=" + data +
                '}';
    }

    /**
     * playBillList : [{"auditorium":"","loadType":"html","angleIcon":"https://img.svipmovie.com/image/2016/11/18/1479437451118072978.png","auditoriumId":"1","loadUrl":"http://cmcc.ips.cnlive.com/content/movie?contentId=613876960&productid=2028593910&ratelevel=2","movieId":"4","playTime":"","pic":"https://img.svipmovie.com/onlinecinema/movie1.jpg","title":"漂流"},{"auditorium":"","loadType":"live","angleIcon":"https://img.svipmovie.com/image/2016/11/18/1479437451118072978.png","auditoriumId":"1","loadUrl":"http://cmcc.ips.cnlive.com/content/movie?contentId=603383211&productid=2028593910&ratelevel=2","movieId":"10","playTime":"","pic":"https://img.svipmovie.com/onlinecinema/movie2.jpg","title":"金刚侠"},{"auditorium":"","loadType":"live","angleIcon":"https://img.svipmovie.com/image/2016/11/18/1479437451118072978.png","auditoriumId":"1","loadUrl":"http://cmcc.ips.cnlive.com/content/movie?contentId=612552469&productid=2028593910&ratelevel=2","movieId":"1","playTime":"","pic":"https://img.svipmovie.com/onlinecinema/movie1.jpg","title":"全职猎人"},{"auditorium":"","loadType":"live","angleIcon":"https://img.svipmovie.com/image/2016/11/18/1479437451118072978.png","auditoriumId":"1","loadUrl":"http://cmcc.ips.cnlive.com/content/movie?contentId=612552469&productid=2028593910&ratelevel=2","movieId":"1","playTime":"","pic":"https://img.svipmovie.com/onlinecinema/movie1.jpg","title":"赏金猎人"}]
     * homeBacPic : https://img.svipmovie.com/onlinecinema/home_bg.png
     * videoHallPic : https://img.svipmovie.com/onlinecinema/hall_bg.png
     * videoHallTitle : 放映厅
     * videoHallList : [{"auditoriumId":"1","pic":"https://img.svipmovie.com/onlinecinema/hall1.png","title":"中国网+VR厅","type":"vr"},{"auditoriumId":"10","pic":"https://img.svipmovie.com/onlinecinema/hall3.jpg","title":"格瓦拉","type":"ordinary"},{"auditoriumId":"11","pic":"https://img.svipmovie.com/onlinecinema/hall3.jpg","title":"好莱坞厅","type":"ordinary"},{"auditoriumId":"4","pic":"https://img.svipmovie.com/onlinecinema/hall3.jpg","title":"娱票儿厅","type":"ordinary"},{"auditoriumId":"6","pic":"https://img.svipmovie.com/onlinecinema/hall3.jpg","title":"咪咕怀旧厅","type":"ordinary"},{"auditoriumId":"7","pic":"https://img.svipmovie.com/onlinecinema/hall3.jpg","title":"汽车电影厅","type":"ordinary"},{"auditoriumId":"8","pic":"https://img.svipmovie.com/onlinecinema/hall3.jpg","title":"动漫厅","type":"ordinary"},{"auditoriumId":"9","pic":"https://img.svipmovie.com/onlinecinema/hall3.jpg","title":"情侣厅","type":"ordinary"}]
     */

    private DataBean data;

    /**
     * data : {"playBillList":[{"auditorium":"","loadType":"html","angleIcon":"https://img.svipmovie.com/image/2016/11/18/1479437451118072978.png","auditoriumId":"1","loadUrl":"http://cmcc.ips.cnlive.com/content/movie?contentId=613876960&productid=2028593910&ratelevel=2","movieId":"4","playTime":"","pic":"https://img.svipmovie.com/onlinecinema/movie1.jpg","title":"漂流"},{"auditorium":"","loadType":"live","angleIcon":"https://img.svipmovie.com/image/2016/11/18/1479437451118072978.png","auditoriumId":"1","loadUrl":"http://cmcc.ips.cnlive.com/content/movie?contentId=603383211&productid=2028593910&ratelevel=2","movieId":"10","playTime":"","pic":"https://img.svipmovie.com/onlinecinema/movie2.jpg","title":"金刚侠"},{"auditorium":"","loadType":"live","angleIcon":"https://img.svipmovie.com/image/2016/11/18/1479437451118072978.png","auditoriumId":"1","loadUrl":"http://cmcc.ips.cnlive.com/content/movie?contentId=612552469&productid=2028593910&ratelevel=2","movieId":"1","playTime":"","pic":"https://img.svipmovie.com/onlinecinema/movie1.jpg","title":"全职猎人"},{"auditorium":"","loadType":"live","angleIcon":"https://img.svipmovie.com/image/2016/11/18/1479437451118072978.png","auditoriumId":"1","loadUrl":"http://cmcc.ips.cnlive.com/content/movie?contentId=612552469&productid=2028593910&ratelevel=2","movieId":"1","playTime":"","pic":"https://img.svipmovie.com/onlinecinema/movie1.jpg","title":"赏金猎人"}],"homeBacPic":"https://img.svipmovie.com/onlinecinema/home_bg.png","videoHallPic":"https://img.svipmovie.com/onlinecinema/hall_bg.png","videoHallTitle":"放映厅","videoHallList":[{"auditoriumId":"1","pic":"https://img.svipmovie.com/onlinecinema/hall1.png","title":"中国网+VR厅","type":"vr"},{"auditoriumId":"10","pic":"https://img.svipmovie.com/onlinecinema/hall3.jpg","title":"格瓦拉","type":"ordinary"},{"auditoriumId":"11","pic":"https://img.svipmovie.com/onlinecinema/hall3.jpg","title":"好莱坞厅","type":"ordinary"},{"auditoriumId":"4","pic":"https://img.svipmovie.com/onlinecinema/hall3.jpg","title":"娱票儿厅","type":"ordinary"},{"auditoriumId":"6","pic":"https://img.svipmovie.com/onlinecinema/hall3.jpg","title":"咪咕怀旧厅","type":"ordinary"},{"auditoriumId":"7","pic":"https://img.svipmovie.com/onlinecinema/hall3.jpg","title":"汽车电影厅","type":"ordinary"},{"auditoriumId":"8","pic":"https://img.svipmovie.com/onlinecinema/hall3.jpg","title":"动漫厅","type":"ordinary"},{"auditoriumId":"9","pic":"https://img.svipmovie.com/onlinecinema/hall3.jpg","title":"情侣厅","type":"ordinary"}]}
     * errorMessage : 成功
     * errorCode : 0
     */

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private String homeBacPic;
        private String videoHallPic;
        private String videoHallTitle;
        /**
         * auditorium :
         * loadType : html
         * angleIcon : https://img.svipmovie.com/image/2016/11/18/1479437451118072978.png
         * auditoriumId : 1
         * loadUrl : http://cmcc.ips.cnlive.com/content/movie?contentId=613876960&productid=2028593910&ratelevel=2
         * movieId : 4
         * playTime :
         * pic : https://img.svipmovie.com/onlinecinema/movie1.jpg
         * title : 漂流
         */

        private List<PlayBillListBean> playBillList;
        /**
         * auditoriumId : 1
         * pic : https://img.svipmovie.com/onlinecinema/hall1.png
         * title : 中国网+VR厅
         * type : vr
         */

        private List<VideoHallListBean> videoHallList;

        public String getHomeBacPic() {
            return homeBacPic;
        }

        public void setHomeBacPic(String homeBacPic) {
            this.homeBacPic = homeBacPic;
        }

        public String getVideoHallPic() {
            return videoHallPic;
        }

        public void setVideoHallPic(String videoHallPic) {
            this.videoHallPic = videoHallPic;
        }

        public String getVideoHallTitle() {
            return videoHallTitle;
        }

        public void setVideoHallTitle(String videoHallTitle) {
            this.videoHallTitle = videoHallTitle;
        }

        public List<PlayBillListBean> getPlayBillList() {
            return playBillList;
        }

        public void setPlayBillList(List<PlayBillListBean> playBillList) {
            this.playBillList = playBillList;
        }

        public List<VideoHallListBean> getVideoHallList() {
            return videoHallList;
        }

        public void setVideoHallList(List<VideoHallListBean> videoHallList) {
            this.videoHallList = videoHallList;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "homeBacPic='" + homeBacPic + '\'' +
                    ", videoHallPic='" + videoHallPic + '\'' +
                    ", videoHallTitle='" + videoHallTitle + '\'' +
                    ", playBillList=" + playBillList +
                    ", videoHallList=" + videoHallList +
                    '}';
        }

        public static class PlayBillListBean {
            private String auditorium;
            private String loadType;
            private String angleIcon;
            private String auditoriumId;
            private String loadUrl;
            private String movieId;
            private String playTime;
            private String pic;
            private String title;

            public String getAuditorium() {
                return auditorium;
            }

            public void setAuditorium(String auditorium) {
                this.auditorium = auditorium;
            }

            public String getLoadType() {
                return loadType;
            }

            public void setLoadType(String loadType) {
                this.loadType = loadType;
            }

            public String getAngleIcon() {
                return angleIcon;
            }

            public void setAngleIcon(String angleIcon) {
                this.angleIcon = angleIcon;
            }

            public String getAuditoriumId() {
                return auditoriumId;
            }

            public void setAuditoriumId(String auditoriumId) {
                this.auditoriumId = auditoriumId;
            }

            public String getLoadUrl() {
                return loadUrl;
            }

            public void setLoadUrl(String loadUrl) {
                this.loadUrl = loadUrl;
            }

            public String getMovieId() {
                return movieId;
            }

            public void setMovieId(String movieId) {
                this.movieId = movieId;
            }

            public String getPlayTime() {
                return playTime;
            }

            public void setPlayTime(String playTime) {
                this.playTime = playTime;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            @Override
            public String toString() {
                return "PlayBillListBean{" +
                        "auditorium='" + auditorium + '\'' +
                        ", loadType='" + loadType + '\'' +
                        ", angleIcon='" + angleIcon + '\'' +
                        ", auditoriumId='" + auditoriumId + '\'' +
                        ", loadUrl='" + loadUrl + '\'' +
                        ", movieId='" + movieId + '\'' +
                        ", playTime='" + playTime + '\'' +
                        ", pic='" + pic + '\'' +
                        ", title='" + title + '\'' +
                        '}';
            }
        }

        public static class VideoHallListBean {
            private String auditoriumId;
            private String pic;
            private String title;
            private String type;

            public String getAuditoriumId() {
                return auditoriumId;
            }

            public void setAuditoriumId(String auditoriumId) {
                this.auditoriumId = auditoriumId;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            @Override
            public String toString() {
                return "VideoHallListBean{" +
                        "auditoriumId='" + auditoriumId + '\'' +
                        ", pic='" + pic + '\'' +
                        ", title='" + title + '\'' +
                        ", type='" + type + '\'' +
                        '}';
            }
        }
    }
}
