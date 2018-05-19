package com.stuManager.util;

/**
 * 通用分页查询 默认 当前页为 第一页； 每页数量为 8
 * 
 * @author Jelly
 */
public class Page {
	private int itemCont;// 总数据数目
	private int pageCont;// 总页数
	private int pageCurrent;// 当前页
	private int pageSize;// 每页多少数据
	private int itemStart;// 起始位置
	private int itemEnd;// 结束位置
	/**
	 * 默认 当前页为 第一页； 每页数量为 8
	 */
	public Page() {
		pageCurrent = 1;
		pageSize = 8;
	}
	/**
	 * 获取总记录数
	 */
	public int getItemCont() {
		return itemCont;
	}
	/**
	 * 设置总记录数
	 */
	public void setItemCont(int itmCont) {
		this.itemCont = itmCont;
	}
	/**
	 * 获取当前页 码
	 */
	public int getPageCurrent() {
		return pageCurrent;
	}
	/**
	 * 设置当前页码
	 */
	public void setPageCurrent(int pageCurrent) {
		this.pageCurrent = pageCurrent;
	}
	/**
	 * 获取当前 每页有数据
	 */
	public int getPageSize() {
		return pageSize;
	}
	/**
	 * 设置当前每页有多少数据
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	/**
	 * 获取起始页
	 */
	public int getItemStart() {
		return (pageCurrent - 1) * pageSize;
	}
	/**
	 * 获取结束页
	 */
	public int getItemEnd() {
		return getItemStart() + pageSize;
	}
	/**
	 * 设置结束页
	 */
	public void setItemEnd(int itemEnd) {
		this.itemEnd = itemEnd;
	}

	/**
	 * 计算一共多少页
	 */
	public int getPageCont() {
		return (itemCont + pageSize - 1) / pageSize;
		// return itemCont % pageSize == 0 ? itemCont / pageSize : (itemCont /
		// pageSize + 1);
	}

}
