package com.recycleviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * 类描述：
 * 创建人：xuyaxi
 * 创建时间：2017/8/14 14:39
 */
public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private Context mContext;
    private List<News> list;

    public NewsAdapter(Context context, List<News> list) {
        mContext = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //垂直
        //View view = View.inflate(mContext, R.layout.item_news_horizontal, null);

        //横向
        View view = View.inflate(mContext, R.layout.item_news_vertical, null);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        News news = list.get(position);
        Glide.with(mContext).load(news.getName()).into(holder.image_news);
        holder.txt_news.setText(news.getPath());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView image_news;
        private TextView txt_news;

        public ViewHolder(View itemView) {
            super(itemView);
            //垂直
            // image_news = (ImageView) itemView.findViewById(R.id.image_news_vertical);

            //横向
            image_news = (ImageView) itemView.findViewById(R.id.image_news_horizontal);
            txt_news = (TextView) itemView.findViewById(R.id.txt_news);


        }
    }
}
