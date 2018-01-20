package com.ams.service;

import java.util.List;

import com.ams.beans.FlatBean;

public interface FlatService {

	public void add(FlatBean flatBean);

	public void update(FlatBean flatBean);

	public void delete(FlatBean flatBean);

	public List<FlatBean> findAll();

	public FlatBean findById(String flatId);
}
