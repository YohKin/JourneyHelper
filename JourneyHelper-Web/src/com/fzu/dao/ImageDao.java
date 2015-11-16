package com.fzu.dao;

import java.util.List;

import com.fzu.model.Image;
import com.fzu.model.Route;
import com.fzu.model.User;

public interface ImageDao {

	/**
	 * ���ݱ�ʶ���Լ���Itineraryʵ��
	 * 
	 * @param id
	 * @return
	 */
	public Image get(Integer id);

	/**
	 * �־û�ָ��ʵ��
	 * 
	 * @param Image
	 * @return
	 */
	public Integer save(Image image);

	/**
	 * �޸ĳ־û�ʵ��
	 * 
	 * @param image
	 */
	public void update(Image image);

	/**
	 * ɾ���־û�ʵ��
	 * 
	 * @param image
	 */
	public void delete(Image image);

	/**
	 * ����idɾ���־û�ʵ��
	 * 
	 * @param id
	 */
	public void delete(Integer id);

	/**
	 * ��ѯ�г��е���Ƭǽ
	 * 
	 * @param route
	 * @return
	 */
	public List<Image> findByRoute(Route route);

	/**
	 * ��ѯ�û���������Ƭ
	 * 
	 * @param user
	 * @return
	 */
	public List<Image> findUserImageByUser(User user);
}