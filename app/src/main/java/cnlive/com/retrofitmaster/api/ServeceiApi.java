package cnlive.com.retrofitmaster.api;

import cnlive.com.retrofitmaster.bean.HomePage;
import retrofit2.http.GET;
import rx.Observable;

/**
 * @author 陈硕
 * @time 2017/1/19  9:04
 * @desc ${TODD}
 */
public interface ServeceiApi {




  @GET("/from/headPageApi/headPage.do")
  Observable<HomePage> getHomePage();




 /* http://m2.qiushibaike.com/article/list/video?page=2&
  // count=30&
  // readarticles=[115762484,115762135,115764350,115761463,115760316,115764445,115763537,115758684]&
  // rqcnt=17&
  // r=804df97a1459411164081";*/


}
