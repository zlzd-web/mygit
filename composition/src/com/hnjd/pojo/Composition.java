package com.hnjd.pojo;

public class Composition {
	private Integer composition_id;
	private String composition_name;
	private String composition_brief;
	private String composition_detail;
	private Competitor competitor;

	public Composition() {
		super();
	}

	public Composition(Integer composition_id, String composition_name,
			String composition_brief, String composition_detail,
			Competitor competitor) {
		super();
		this.composition_id = composition_id;
		this.composition_name = composition_name;
		this.composition_brief = composition_brief;
		this.composition_detail = composition_detail;
		this.competitor = competitor;
	}

	public Integer getComposition_id() {
		return composition_id;
	}

	public void setComposition_id(Integer composition_id) {
		this.composition_id = composition_id;
	}

	public String getComposition_name() {
		return composition_name;
	}

	public void setComposition_name(String composition_name) {
		this.composition_name = composition_name;
	}

	public String getComposition_brief() {
		return composition_brief;
	}

	public void setComposition_brief(String composition_brief) {
		this.composition_brief = composition_brief;
	}

	public String getComposition_detail() {
		return composition_detail;
	}

	public void setComposition_detail(String composition_detail) {
		this.composition_detail = composition_detail;
	}

	public Competitor getCompetitor() {
		return competitor;
	}

	public void setCompetitor(Competitor competitor) {
		this.competitor = competitor;
	}

	@Override
	public String toString() {
		return "Composition [composition_id=" + composition_id
				+ ", composition_name=" + composition_name
				+ ", composition_brief=" + composition_brief
				+ ", composition_detail=" + composition_detail
				+ ", competitor=" + competitor + "]";
	}

}
