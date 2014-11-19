package com.makeagame.core.component;

import java.util.ArrayList;

import com.makeagame.core.model.Model;
import com.makeagame.core.view.RenderEvent;
import com.makeagame.core.view.SignalEvent;
import com.makeagame.core.view.View;

public abstract class BaseButton implements Model, View {

	float x,y;
	float w,h;
	
	@Override
	public void signal(ArrayList<SignalEvent> s) {
		
//		if()
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<RenderEvent> render(ArrayList<String> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void process(String gsonString) {
		// TODO Auto-generated method stub
		
	}
	
	public abstract boolean onButtonClick();
	
	@Override
	public abstract String hold();

	@Override
	public String info() {
		return "button";
	}
	
	

}