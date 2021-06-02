package com.hbuddy.beans;

import java.io.Serializable;

import lombok.Data;

@Data
public class Feed implements Serializable {

	private static final long serialVersionUID = -1574559669712594525L;

	private String id;
	private String content;

}
