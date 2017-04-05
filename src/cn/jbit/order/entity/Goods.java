package cn.jbit.order.entity;

import java.util.HashSet;
import java.util.Set;

public class Goods implements java.io.Serializable {

	private static final long serialVersionUID = -2454796817668380979L;
	private Long id;
	private Double price;
	private String name;
	private String specification;
	private String manufacturer;
	private Set<Orderitem> orderitems = new HashSet<Orderitem>(0);
	
	public Goods() {
		super();
	}
	
	public Goods(Double price, String name, String specification,
			String manufacturer) {
		this.price = price;
		this.name = name;
		this.specification = specification;
		this.manufacturer = manufacturer;
	}

	public Goods(Long id, Double price, String name, String specification,
			String manufacturer, Set<Orderitem> orderitems) {
		this.id = id;
		this.price = price;
		this.name = name;
		this.specification = specification;
		this.manufacturer = manufacturer;
		this.orderitems = orderitems;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", price=" + price + ", name=" + name
				+ ", specification=" + specification + ", manufacturer="
				+ manufacturer + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result
				+ ((specification == null) ? 0 : specification.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Goods other = (Goods) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (specification == null) {
			if (other.specification != null)
				return false;
		} else if (!specification.equals(other.specification))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Set<Orderitem> getOrderitems() {
		return orderitems;
	}

	public void setOrderitems(Set<Orderitem> orderitems) {
		this.orderitems = orderitems;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}