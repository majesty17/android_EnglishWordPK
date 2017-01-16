package com.majesty.wordpk.frg;

import com.majesty.wordpk.R;
import com.majesty.wordpk.aty.WordtestActivity;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Toast;

public class WordtestFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_wordtest, container, false);
		
		//進入測試
		rootView.findViewById(R.id.button_starttest).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//Toast.makeText(getContext(), "Enter word test!", Toast.LENGTH_SHORT).show();
				startActivity(new Intent(getActivity(),WordtestActivity.class));
			}
		});
		
		
		
		return rootView;
	}
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
	}
}
