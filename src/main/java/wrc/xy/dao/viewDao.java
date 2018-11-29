package wrc.xy.dao;

import java.util.ArrayList;

import wrc.xy.entity.view;

public interface viewDao {

	public void add(view v);
	public void delete(view v);
	public ArrayList<view> get(view v);
	public void viewUpdate(view v);
}
