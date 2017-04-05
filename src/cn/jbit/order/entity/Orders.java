package cn.jbit.order.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Orders implements java.io.Serializable {

	private static final long serialVersionUID = 4020214485303496450L;
	private Long id;
	private String name;
	private String address;
	private Date createtime;
	private Set<Orderitem> orderitems = new HashSet<Orderitem>(0);

	public Orders() {
		super();
	}

	public Orders(String name, String address, Date createtime) {
		this.name = name;
		this.address = address;
		this.createtime = createtime;
	}

	public Orders(Long id, String name, String address, Date createtime,
			Set<Orderitem> orderitems) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.createtime = createtime;
		this.orderitems = orderitems;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", name=" + name + ", address=" + address
				+ ", createtime=" + createtime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result
				+ ((createtime == null) ? 0 : createtime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Orders other = (Orders) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (createtime == null) {
			if (other.createtime != null)
				return false;
		} else if (!createtime.equals(other.createtime))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
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