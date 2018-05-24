package cn.yurui.pojo;

import java.math.BigDecimal;

public class TbItem {
	private Long id;
	private String title;
	private String sellPoint;
	private BigDecimal price;
	private Integer num;
	private String barcode;
	private String image;
	private Long cid;

	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getSellPoint() {
		return sellPoint;
	}



	public void setSellPoint(String sellPoint) {
		this.sellPoint = sellPoint;
	}



	public BigDecimal getPrice() {
		return price;
	}



	public void setPrice(BigDecimal price) {
		this.price = price;
	}



	public Integer getNum() {
		return num;
	}



	public void setNum(Integer num) {
		this.num = num;
	}



	public String getBarcode() {
		return barcode;
	}



	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}



	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}



	public Long getCid() {
		return cid;
	}



	public void setCid(Long cid) {
		this.cid = cid;
	}



	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", sellPoint=" + sellPoint + ", price=" + price + ", num=" + num
				+ ", barcode=" + barcode + ", image=" + image + ", cid=" + cid + "]";
	}

}
