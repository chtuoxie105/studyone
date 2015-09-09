package com.example.testone003.Intent;

import java.util.Stack;

import android.app.Activity;
import android.app.Application;

public class MyApplication extends Application {

	Stack<Activity> list = new Stack<Activity>();
	
	public class MyStack  extends Stack{
		public void sPush(Activity acti){
			list.push(acti);
		}
		public Activity sPop(){
			Activity acti = null;
			for(Activity n:list){
			acti = list.pop();
			}	
			return acti;
		}
	}	
}
