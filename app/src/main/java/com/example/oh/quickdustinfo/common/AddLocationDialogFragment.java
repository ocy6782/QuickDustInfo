package com.example.oh.quickdustinfo.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import com.example.oh.quickdustinfo.R;



/**
 * Created by oh on 2020-06-25.
 */

public class AddLocationDialogFragment extends DialogFragment {
    private EditText mCityEditText;

    private  OnClickListener mOKClickListener;

    public  interface  OnClickListener {
        void  onOKClicked(String city);
    }

    public  void  setmOKClickListener(OnClickListener listener) {
        mOKClickListener = listener;
    }

    public  static AddLocationDialogFragment newInstance(OnClickListener listener) {
        Bundle args = new Bundle();
        AddLocationDialogFragment fragment = new AddLocationDialogFragment();
        fragment.setmOKClickListener(listener);
        return  fragment;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext())
                .inflate(R.layout.fragment_add_loaction, null, false);
        mCityEditText = view.findViewById(R.id.city_edit);
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("위치 추가");
        builder.setView(view);
        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {   /// 이거 수정
               String city = mCityEditText.getText().toString();
               mOKClickListener.onOKClicked(city);
            }
        });
        builder.setNegativeButton("취소", null);

        return builder.create();
    }
}
