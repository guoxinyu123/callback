package iet.jxufe.cn.android;

import android.content.Context;

public class mybutton extends Button {
	context context;
	public mybutton (Context context, AttributeSet attrs){
		super(context, attrs);
		this.context=context;
	}
    public boolean onTouchEvent(MotionEvent enent) {
    	Toast.makeText(context,"mybotton�д����¼�������!",Toast.LENGTH_SHORT).show();
    	return ture;
    }
}
    