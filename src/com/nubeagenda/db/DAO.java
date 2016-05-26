package com.nubeagenda.db;

import java.util.Properties;

import util.PropertyValues;


public abstract class DAO {
	protected Properties properties = null;
	protected static String url;
	protected static String user;
	protected static String password;

	public DAO() {
		PropertyValues pv = new PropertyValues();
		try {
			this.properties = pv.getPropValues();
			loadProperties();
			Class.forName( this.properties.getProperty("dbdriver") ).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Properties getProperties() {
		return this.properties;
	}

	public boolean loadProperties() {

		DAO.url = properties.getProperty("url");
		DAO.user = properties.getProperty("user");
		DAO.password = properties.getProperty("password");

		return true;
	}

}