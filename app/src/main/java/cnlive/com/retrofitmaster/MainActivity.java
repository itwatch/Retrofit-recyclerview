package cnlive.com.retrofitmaster;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.backends.okhttp3.OkHttpImagePipelineConfigFactory;

import cnlive.com.retrofitmaster.adpter.Myadpter;
import cnlive.com.retrofitmaster.api.ServeceiApi;
import cnlive.com.retrofitmaster.bean.HomePage;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
private Button button;
    private HomePage homePage;
    private RecyclerView tv_rceycl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        Fresco.initialize(this, OkHttpImagePipelineConfigFactory
                .newBuilder(this, new OkHttpClient())
                .build());





        setContentView(R.layout.activity_main);
        button= (Button) this.findViewById(R.id.button);

        tv_rceycl= (RecyclerView) this.findViewById(R.id.tv_rceycl);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://perapi.svipmovie.com")
                        .client(new OkHttpClient().newBuilder().build())
                        .addConverterFactory(GsonConverterFactory.create())
                        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                        .build();
                ServeceiApi serveceiApi = retrofit.create(ServeceiApi.class);

                serveceiApi.getHomePage()
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<HomePage>() {
                    @Override
                    public void onCompleted() {
                        Toast.makeText(MainActivity.this,homePage.toString()+"sdfssdf",Toast.LENGTH_LONG).show();
                        String homeBacPic = homePage.getData().getHomeBacPic();

                        tv_rceycl.setAdapter(new Myadpter(MainActivity.this,homePage));
                       // tv_rceycl.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                        tv_rceycl.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));
                    }

                    @Override
                    public void onError(Throwable e) {
                        Toast.makeText(MainActivity.this,"失败"+e.toString(),Toast.LENGTH_LONG).show();

                    }

                    @Override
                    public void onNext(HomePage homePage) {
                        MainActivity.this.homePage=homePage;
                    }
                });






            }
        });
    }
}
