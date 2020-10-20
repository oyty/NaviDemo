package com.amap.navi.demo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class RouteLineView extends FrameLayout {

    private final Context mContext;
    TextView title;
    Button mBtn1;
    Button mBtn2;

    public RouteLineView(@NonNull Context context) {
        this(context, null);
    }

    public RouteLineView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RouteLineView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initView();
    }

    private void initView() {
        View view = View.inflate(mContext, R.layout.view_route_line, this);
        title = view.findViewById(R.id.title);
        mBtn1 = view.findViewById(R.id.mSimulationAction);
        mBtn2 = view.findViewById(R.id.mNavigationAction);
    }

    public void refresh(RouteLineEntity item) {
        title.setText(item.title);
    }

    public void setSimulationListener(View.OnClickListener listener) {
        mBtn1.setOnClickListener(listener);
    }

    public void setNavigationListener(View.OnClickListener listener) {
        mBtn2.setOnClickListener(listener);
    }
}
