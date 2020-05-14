package com.cubas.genericcontroller.dtos;

import java.util.List;

public class PageDTO<E> {

	private List<E> contents;

	private Integer totalElements;

	private Integer page;

	public PageDTO(List<E> contents, Integer totalElements, Integer page) {
		super();
		this.contents = contents;
		this.totalElements = totalElements;
		this.page = page;
	}

	public List<E> getContents() {
		return contents;
	}

	public void setContents(List<E> contents) {
		this.contents = contents;
	}

	public Integer getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

}
