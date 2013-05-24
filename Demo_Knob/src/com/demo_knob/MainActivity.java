package com.demo_knob;

import android.os.Bundle;
import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.LinearLayout.LayoutParams;
import com.lib_knobgrad.*;
import com.lib_knobgrad.Knob.KnobListener;

public class MainActivity extends Activity 
{
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		// Get screen info
		DisplayMetrics dm = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(dm);
		
		Knob knob_1 = (Knob)this.findViewById(R.id.knob_1);
		Knob knob_2 = (Knob)this.findViewById(R.id.knob_2);
		Knob knob_3 = (Knob)this.findViewById(R.id.knob_3);
		Knob knob_4 = (Knob)this.findViewById(R.id.knob_4);
		Knob knob_5 = (Knob)this.findViewById(R.id.knob_5);
		Knob knob_6 = (Knob)this.findViewById(R.id.knob_6);
		
		knob_1.setGraduation(Knob.GRAD_TYPE0);
		knob_1.setKnob(Knob.GRAD_TYPE0);
		knob_1.setMax(15);
		
		knob_2.setGraduation(Knob.GRAD_TYPE1);
		knob_2.setKnob(Knob.GRAD_TYPE1);
		knob_2.setMax(15);
		
		knob_3.setGraduation(Knob.GRAD_TYPE2);
		knob_3.setKnob(Knob.GRAD_TYPE2);
		knob_3.setMax(15);
		
		knob_4.setGraduation(Knob.GRAD_TYPE3);
		knob_4.setKnob(Knob.GRAD_TYPE3);
		knob_4.setMax(15);
		
		knob_5.setGraduation(Knob.GRAD_TYPE4);
		knob_5.setKnob(Knob.GRAD_TYPE4);
		knob_5.setMax(15);
		
		knob_6.setGraduation(Knob.GRAD_TYPE5);
		knob_6.setKnob(Knob.GRAD_TYPE5);
		knob_6.setMax(15);
		
		
		if(dm.widthPixels>dm.heightPixels)
		{
			knob_1.setLayoutParams(new LayoutParams(dm.heightPixels/2,dm.heightPixels/2));
			knob_2.setLayoutParams(new LayoutParams(dm.heightPixels/2,dm.heightPixels/2));
			knob_3.setLayoutParams(new LayoutParams(dm.heightPixels/2,dm.heightPixels/2));
			knob_4.setLayoutParams(new LayoutParams(dm.heightPixels/2,dm.heightPixels/2));
			knob_5.setLayoutParams(new LayoutParams(dm.heightPixels/2,dm.heightPixels/2));
			knob_6.setLayoutParams(new LayoutParams(dm.heightPixels/2,dm.heightPixels/2));
		}
		else
		{
			knob_1.setLayoutParams(new LayoutParams(dm.widthPixels/2,dm.widthPixels/2));
			knob_2.setLayoutParams(new LayoutParams(dm.widthPixels/2,dm.widthPixels/2));
			knob_3.setLayoutParams(new LayoutParams(dm.widthPixels/2,dm.widthPixels/2));
			knob_4.setLayoutParams(new LayoutParams(dm.widthPixels/2,dm.widthPixels/2));
			knob_5.setLayoutParams(new LayoutParams(dm.widthPixels/2,dm.widthPixels/2));
			knob_6.setLayoutParams(new LayoutParams(dm.widthPixels/2,dm.widthPixels/2));
		}
		
		
		
		knob_1.setKnobListener(new KnobListener()
		{
			@Override
			public void onKnobChanged(int position) 
			{
				Log.v("Folus_Debug", String.valueOf(position));
			}

			@Override
			public void onKnobChangedComplete(int position) 
			{
				Log.v("Folus_Debug", String.valueOf(position));	
			}
		});
		
	}
}
