//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.2.
//


package com.ecg.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ecg_analysis.R.layout;
import info.hoang8f.widget.FButton;
import org.androidannotations.api.BackgroundExecutor;
import org.androidannotations.api.builder.ActivityIntentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class MainActivity_
    extends MainActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.activity_main);
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static MainActivity_.IntentBuilder_ intent(Context context) {
        return new MainActivity_.IntentBuilder_(context);
    }

    public static MainActivity_.IntentBuilder_ intent(android.app.Fragment fragment) {
        return new MainActivity_.IntentBuilder_(fragment);
    }

    public static MainActivity_.IntentBuilder_ intent(android.support.v4.app.Fragment supportFragment) {
        return new MainActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        linerlayout_main_text = ((LinearLayout) hasViews.findViewById(com.ecg_analysis.R.id.linerlayout_main_text));
        MainActivity_TextView_ShowConnectState = ((TextView) hasViews.findViewById(com.ecg_analysis.R.id.MainActivity_TextView_ShowConnectState));
        linerlayout_main_connect_button = ((LinearLayout) hasViews.findViewById(com.ecg_analysis.R.id.linerlayout_main_connect_button));
        service_list = ((ListView) hasViews.findViewById(com.ecg_analysis.R.id.service_list));
        main_cancel = ((FButton) hasViews.findViewById(com.ecg_analysis.R.id.main_cancel));
        linerlayout_main = ((RelativeLayout) hasViews.findViewById(com.ecg_analysis.R.id.linerlayout_main));
        main_connect = ((FButton) hasViews.findViewById(com.ecg_analysis.R.id.main_connect));
        linerlayout_main_connect = ((LinearLayout) hasViews.findViewById(com.ecg_analysis.R.id.linerlayout_main_connect));
        {
            View view = hasViews.findViewById(com.ecg_analysis.R.id.MainActivity_Button_ConnectAtNow);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        MainActivity_.this.MainActivity_Button_ConnectAtNow();
                    }

                }
                );
            }
        }
        if (main_connect!= null) {
            main_connect.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    MainActivity_.this.main_connect();
                }

            }
            );
        }
        if (main_cancel!= null) {
            main_cancel.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    MainActivity_.this.main_cancel();
                }

            }
            );
        }
        if (service_list!= null) {
            service_list.setOnItemClickListener(new OnItemClickListener() {


                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    MainActivity_.this.service_list(position);
                }

            }
            );
        }
        init();
    }

    @Override
    public void ConnectDevice() {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    MainActivity_.super.ConnectDevice();
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    @Override
    public void scanLeDevice(final boolean enable) {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 1000, "") {


            @Override
            public void execute() {
                try {
                    MainActivity_.super.scanLeDevice(enable);
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    public static class IntentBuilder_
        extends ActivityIntentBuilder<MainActivity_.IntentBuilder_>
    {

        private android.app.Fragment fragment_;
        private android.support.v4.app.Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, MainActivity_.class);
        }

        public IntentBuilder_(android.app.Fragment fragment) {
            super(fragment.getActivity(), MainActivity_.class);
            fragment_ = fragment;
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment) {
            super(fragment.getActivity(), MainActivity_.class);
            fragmentSupport_ = fragment;
        }

        @Override
        public void startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent, requestCode);
            } else {
                if (fragment_!= null) {
                    fragment_.startActivityForResult(intent, requestCode);
                } else {
                    super.startForResult(requestCode);
                }
            }
        }

    }

}