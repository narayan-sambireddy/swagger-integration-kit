package narayan.swagger.integration.kit.domain;

import java.util.List;

public class Alpha {

	private String name;

	private String id;

	private List<Beta> betas;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Beta> getBetas() {
		return betas;
	}

	public void setBetas(List<Beta> betas) {
		this.betas = betas;
	}

}
