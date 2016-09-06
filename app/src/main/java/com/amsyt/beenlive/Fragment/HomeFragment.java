package com.amsyt.beenlive.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.amsyt.beenlive.BeenLive.SignUpActivity;
import com.amsyt.beenlive.Constant.C;
import com.amsyt.beenlive.R;

import java.util.zip.Inflater;

/**
 * Created by amsyt005 on 2/9/16.
 */

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.homefragment, container, false);

        ListView list = (ListView)view.findViewById(R.id.profilelist);
        HomeArrayAdapter adapter = new HomeArrayAdapter(getContext(),0);
        list.setAdapter(adapter);
        C.applyTypeface(C.getParentView(view.findViewById(R.id.home_profile)),C.getAvenirProRegularFontTypeface(getContext()));

      for(int i=0; i<5;i++){
          adapter.add(new Item(R.drawable.profilebackgrounddummy));
      }
        return view;
    }


    private class HomeArrayAdapter extends ArrayAdapter<Item>{

        public HomeArrayAdapter(Context context, int resource) {
            super(context, resource);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_list_homefragment, parent, false);
            }
            return convertView;
        }
    }

    public class Item{

        public int profileImage;

       public Item(int profileImage){
           this.profileImage = profileImage;
        }

    }

}
