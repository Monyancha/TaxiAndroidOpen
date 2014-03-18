//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0-SNAPSHOT.
//


package com.opentaxi.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.opentaxi.android.R.id;
import com.opentaxi.android.R.layout;
import com.opentaxi.models.Users;
import org.androidannotations.api.BackgroundExecutor;
import org.androidannotations.api.SdkVersionHelper;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class UserPassActivity_
    extends UserPassActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    private Handler handler_ = new Handler(Looper.getMainLooper());

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.login);
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

    public static UserPassActivity_.IntentBuilder_ intent(Context context) {
        return new UserPassActivity_.IntentBuilder_(context);
    }

    public static UserPassActivity_.IntentBuilder_ intent(Fragment supportFragment) {
        return new UserPassActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (((SdkVersionHelper.getSdkInt()< 5)&&(keyCode == KeyEvent.KEYCODE_BACK))&&(event.getRepeatCount() == 0)) {
            onBackPressed();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        pbProgress = ((ProgressBar) hasViews.findViewById(id.pbProgress));
        userName = ((EditText) hasViews.findViewById(id.userNameField));
        loginLayout = ((LinearLayout) hasViews.findViewById(id.loginLayout));
        pass = ((EditText) hasViews.findViewById(id.passwordField));
        {
            View view = hasViews.findViewById(id.facebookButton);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        UserPassActivity_.this.facebookButton();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.newClient);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        UserPassActivity_.this.newClient();
                    }

                }
                );
            }
        }
        {
            View view = hasViews.findViewById(id.lostPassword);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        UserPassActivity_.this.lostPassword();
                    }

                }
                );
            }
        }
        afterLoad();
    }

    @Override
    public void setError(final String error) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                UserPassActivity_.super.setError(error);
            }

        }
        );
    }

    @Override
    public void showProgress() {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                UserPassActivity_.super.showProgress();
            }

        }
        );
    }

    @Override
    public void facebookUser(final Users user) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                UserPassActivity_.super.facebookUser(user);
            }

        }
        );
    }

    @Override
    public void overFacebookLoginTime(final String title) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                UserPassActivity_.super.overFacebookLoginTime(title);
            }

        }
        );
    }

    @Override
    public void hideProgress() {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                UserPassActivity_.super.hideProgress();
            }

        }
        );
    }

    @Override
    public void maxFacebookLoginTime() {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 15000, "") {


            @Override
            public void execute() {
                try {
                    UserPassActivity_.super.maxFacebookLoginTime();
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    @Override
    public void checkFacebook(final String token) {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    UserPassActivity_.super.checkFacebook(token);
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    @Override
    public void login(final String username, final String password) {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    UserPassActivity_.super.login(username, password);
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    public static class IntentBuilder_ {

        private Context context_;
        private final Intent intent_;
        private Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            context_ = context;
            intent_ = new Intent(context, UserPassActivity_.class);
        }

        public IntentBuilder_(Fragment fragment) {
            fragmentSupport_ = fragment;
            context_ = fragment.getActivity();
            intent_ = new Intent(context_, UserPassActivity_.class);
        }

        public Intent get() {
            return intent_;
        }

        public UserPassActivity_.IntentBuilder_ flags(int flags) {
            intent_.setFlags(flags);
            return this;
        }

        public void start() {
            context_.startActivity(intent_);
        }

        public void startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent_, requestCode);
            } else {
                if (context_ instanceof Activity) {
                    ((Activity) context_).startActivityForResult(intent_, requestCode);
                } else {
                    context_.startActivity(intent_);
                }
            }
        }

    }

}
