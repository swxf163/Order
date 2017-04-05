package cn.jbit.order.entity;

public class Orderitem implements java.io.Serializable {

	private static final long serialVersionUID = 5056958243538563842L;
	private Long id;
	private Goods goods;
	private Orders orders;
	private Long amount;

	public Orderitem() {
		super();
	}

	public Orderitem(Long amount) {
		this.amount = amount;
	}

	public Orderitem(Long id, Goods goods, Orders orders, Long amount) {
		this.id = id;
		this.goods = goods;
		this.orders = orders;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Orderitem [id=" + id + ", amount=" + amount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Orderitem other = (Orderitem) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}