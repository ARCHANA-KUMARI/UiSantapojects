package com.robosoft.archanakumari.uisantapojects.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.robosoft.archanakumari.uisantapojects.R;

/**
 * Created by archanakumari on 3/1/16.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {


     private Context mContext;
     private View  mOnerow;
     private static int sCount = 0;
     private String mTime[] = {"2 Mins","10 Mins","41 Mins","15 Mins","34 Mins","56 Mins"};
     private int mListofCircleImages[] = {R.drawable.yellow,R.drawable.green,R.drawable.red,R.drawable.yellow,R.drawable.green,R.drawable.yellow};
     private int mListofImages[] = {R.drawable.onebusinessman,R.drawable.twobusinessman,R.drawable.threebusinessman,R.drawable.fourbusinessman,R.drawable.fivebusinessman,R.drawable.sixbusinessman};
     private String mName[] = {"Jeff Bridges","Morgan Freeman","Laurence Fishburn","Azim Prem ji","N.R. naraayn murthi","Sridhar Vembu"};
     private String mDescription[] = {"Just closed a great deal with the great people from the Califorian group","I will be flying to London this Friday to finalise the investment with P&G","Invoices have been sent for all clients that we worked with March..","Azim Hashim Premji is an Indian business tycoon, investor and philanthropist, who is the chairman of Wipro Limited.","Infosys Limited is an Indian multinational corporation that provides business consulting","Sridhar Vembu is the founder and CEO of ZOHO Corporation (formerly AdventNet Inc [1]). Zoho Corporation are the makers of the online Zoho Office Suite as well as several business applications.\n" +
             "\n"};

    public RecyclerViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mOnerow = LayoutInflater.from(mContext).inflate(R.layout.child, parent, false);
        ViewHolder viewHolder = new ViewHolder(mOnerow);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

     holder.mImageChild.setImageResource(mListofImages[sCount]);
     holder.mImageCircle.setImageResource(mListofCircleImages[sCount]);
     holder.mTextofHeading.setText(mName[sCount]);
     holder.mTextTime.setText( mTime[sCount]);
     holder.mTextofdescription.setText(mDescription[sCount]);
     sCount++;


    }

    @Override
    public int getItemCount() {
        return 6;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView mImageChild;
        private ImageView mImageCircle;
        private TextView mTextofHeading;
        private TextView mTextTime;
        private TextView mTextofdescription;
        public ViewHolder(View itemView) {
            super(itemView);
            mImageChild = (ImageView) itemView.findViewById(R.id.imageofchild);
            mImageCircle = (ImageView) itemView.findViewById(R.id.circle);
            mTextofHeading = (TextView) itemView.findViewById(R.id.childofheading);
            mTextTime = (TextView) itemView.findViewById(R.id.time);
            mTextofdescription = (TextView) itemView.findViewById(R.id.childofdescription);

        }
    }
}
