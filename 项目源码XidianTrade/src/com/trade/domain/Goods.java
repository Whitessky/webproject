package com.trade.domain;

public class Goods {

	private Integer goodsId;
	private String goodsName;
	private Double goodsPrice;
	private String goodsNote;
	private String goodsContact;
	private String goodsPicture;

	private Student student;

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Double getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(Double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public String getGoodsNote() {
		return goodsNote;
	}

	public void setGoodsNote(String goodsNote) {
		this.goodsNote = goodsNote;
	}

	public String getGoodsContact() {
		return goodsContact;
	}

	public void setGoodsContact(String goodsContact) {
		this.goodsContact = goodsContact;
	}

	public String getGoodsPicture() {
		return goodsPicture;
	}

	public void setGoodsPicture(String goodsPicture) {
		this.goodsPicture = goodsPicture;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
