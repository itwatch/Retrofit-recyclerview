package cnlive.com.retrofitmaster.adpter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import cnlive.com.retrofitmaster.R;
import cnlive.com.retrofitmaster.bean.HomePage;

/**
 * @author 陈硕
 * @time 2017/1/19  10:23
 * @desc ${TODD}
 */
public class Myadpter extends RecyclerView.Adapter<Myadpter.AddFriendViewHolder> {

private  Context mcontext;
    private final LayoutInflater mLayoutInflater;
    private HomePage mhomePage;

    public Myadpter(Context context, HomePage homePage) {
        this.mcontext=context;
        mLayoutInflater = LayoutInflater.from(mcontext);
        this.mhomePage=homePage;

    }

    @Override
    public AddFriendViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.activity_item, parent, false);
        AddFriendViewHolder addFriendViewHolder = new AddFriendViewHolder(view);
        return addFriendViewHolder;
    }

    @Override
    public void onBindViewHolder(AddFriendViewHolder holder, int position) {
        holder.friend_face_img.setImageURI(mhomePage.getData().getVideoHallPic());
        holder.textView.setText("demoView");
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    class AddFriendViewHolder extends RecyclerView.ViewHolder {
        SimpleDraweeView friend_face_img;
        TextView textView;

        public AddFriendViewHolder(View itemView) {
            super(itemView);
            friend_face_img = (SimpleDraweeView) itemView.findViewById(R.id.friend_face_img);
            textView= (TextView) itemView.findViewById(R.id.item_text);

        }
    }
}
