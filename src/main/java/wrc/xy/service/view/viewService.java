package wrc.xy.service.view;

import java.util.ArrayList;

import wrc.xy.entity.view;


public interface viewService {

	public void add(view v);
	public void delete(view v);
	public ArrayList<view> get(view v);
	public view viewUpdate(view v);
}
