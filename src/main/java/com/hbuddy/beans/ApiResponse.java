package com.hbuddy.beans;

import java.util.Map;
import javax.annotation.Generated;

import lombok.Data;

import java.io.Serializable;
import java.util.Collections;

@Data
public class ApiResponse implements Serializable {

	private static final long serialVersionUID = 8857550942669555488L;
	private Object data;
	private Map<String, String> issues;
	private Links links;

	@Generated("SparkTools")
	private ApiResponse(Builder builder) {
		this.data = builder.data;
		this.issues = builder.issues;
		this.links = builder.links;
	}

	/**
	 * Creates builder to build {@link ApiResponse}.
	 * 
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link ApiResponse}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private Object data;
		private Map<String, String> issues = Collections.emptyMap();
		private Links links;

		private Builder() {
		}

		public Builder withData(Object data) {
			this.data = data;
			return this;
		}

		public Builder withIssues(Map<String, String> issues) {
			this.issues = issues;
			return this;
		}

		public Builder withLinks(Links links) {
			this.links = links;
			return this;
		}

		public ApiResponse build() {
			return new ApiResponse(this);
		}
	}
}
