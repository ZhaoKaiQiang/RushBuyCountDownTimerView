package com.qust.widght;

import android.app.Activity;
import android.os.Bundle;

import com.qust.rushbuycountdowntimerview.R;

public class MainActivity extends Activity {

	private RushBuyCountDownTimerView timerView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		timerView = (RushBuyCountDownTimerView) findViewById(R.id.timerView);
		// 设置时间(hour,min,sec)
		timerView.setTime(10, 0, 10);
		// 开始倒计时
		timerView.start();
	}
}
