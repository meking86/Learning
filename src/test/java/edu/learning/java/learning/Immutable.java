package edu.learning.java.learning;

import java.util.Collections;
import java.util.Date;
import java.util.List;

final public class Immutable {
	private final String str;
	private final List<String> list ;
	private final Date date;
	public static void main(String[] args) {
		
	}
	public Immutable(String str, List<String> list, Date date) {
		this.str = str;
		this.list = list;
		this.date = new Date(date.getDate());
		Collections.unmodifiableList(list);
		}
	public String getStr() {
		return str;
	}
	public List<String> getList() {
		return list;
	}
	public Date getDate() {
		return new Date(date.getTime());
	}
	
	
	
}
